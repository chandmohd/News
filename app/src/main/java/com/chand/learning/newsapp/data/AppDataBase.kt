package com.chand.learning.newsapp.data

import android.content.Context
import androidx.room.*
import androidx.sqlite.db.SupportSQLiteDatabase
import com.chand.learning.newsapp.utilities.DATABASE_NAME
import com.chand.learning.newsapp.utilities.JsonData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Database(entities = [NewsResponse::class,Article::class,Source::class], version = 1,exportSchema = false)
@TypeConverters(ArticlesConverter::class)
abstract class AppDataBase : RoomDatabase() {

    abstract fun getArticleDao(): ArticleDao

    companion object {

        // For Singleton instantiation
        @Volatile
        private var instance: AppDataBase? = null

        fun getInstance(context: Context): AppDataBase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(
                context,
                AppDataBase::class.java,
                DATABASE_NAME
            ).addCallback(object : RoomDatabase.Callback() {
                override fun onCreate(db: SupportSQLiteDatabase) {
                    super.onCreate(db)
                    CoroutineScope(Dispatchers.IO).launch {
                        JsonData.newsResponse?.let {
                            getInstance(context).getArticleDao().insertAll(
                                it
                            )
                        }
                    }
                }
            }
            ).build()

    }
}
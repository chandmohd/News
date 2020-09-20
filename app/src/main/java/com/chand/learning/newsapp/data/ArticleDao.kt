package com.chand.learning.newsapp.data

import androidx.room.*

@Dao
interface ArticleDao {
    @Query("SELECT * FROM news")
    fun getArticles(): NewsResponse

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(article: NewsResponse)

    @Update
    fun updateData(article: NewsResponse)
}
package com.chand.learning.newsapp.data


import androidx.room.*
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Entity(tableName = "news")
data class NewsResponse(
    @TypeConverters(ArticlesConverter::class)
    val articles: List<Article>?= null,
    val status: String,
    @PrimaryKey(autoGenerate = false)
    var totalResults: Int
)
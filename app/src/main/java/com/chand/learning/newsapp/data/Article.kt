package com.chand.learning.newsapp.data

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
data class Article(
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    @Embedded val source: Source?,
    val title: String,
    val url: String,
    val urlToImage: String
): Serializable {
    @PrimaryKey(autoGenerate = false)
    var article_id :Int = 0
}
package com.chand.learning.newsapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
@Entity
data class Source(
    val id: String,
    val name: String,
):Serializable {
    @PrimaryKey(autoGenerate = false)
    var source_id :Int = 0
}
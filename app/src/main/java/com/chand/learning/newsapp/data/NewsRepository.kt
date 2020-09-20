package com.chand.learning.newsapp.data

import android.util.Log
import com.chand.learning.newsapp.api.ApiService
import com.chand.learning.newsapp.api.SafeApiRequest
import java.io.IOException

class NewsRepository private constructor(
    private val api: ApiService,
    private val db: AppDataBase,
    private val param: HashMap<String, String>
) : SafeApiRequest() {


    suspend fun getNewsHeadLines(): NewsResponse {
        var response: NewsResponse
        try {
            response = apiRequest { api.getHeadLines(param) }
            response.let { db.getArticleDao().updateData(it) }
        } catch (e: IOException) {
            response = db.getArticleDao().getArticles()
            Log.d(TAG, "Error->${e.message}")
        }
        return response
    }

    companion object {
        const val TAG = "NewsRepository"

        // For Singleton instantiation
        @Volatile
        private var instance: NewsRepository? = null

        fun getInstance(api: ApiService, db: AppDataBase, param: HashMap<String, String>) =
            instance ?: synchronized(this) {
                instance ?: NewsRepository(api, db, param).also { instance = it }
            }
    }
}
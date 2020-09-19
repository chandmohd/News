package com.chand.learning.newsapp.data

import com.chand.learning.newsapp.api.ApiService
import com.chand.learning.newsapp.api.SafeApiRequest

class NewsRepository private constructor(private val api:ApiService, private val param:HashMap<String,String>):SafeApiRequest() {

    suspend fun getNewsHeadLines() = apiRequest { api.getHeadLines(param) }

    companion object {

        // For Singleton instantiation
        @Volatile private var instance: NewsRepository? = null

        fun getInstance(api: ApiService,param: HashMap<String, String>) =
            instance ?: synchronized(this) {
                instance ?: NewsRepository(api,param).also { instance = it }
            }
    }
}
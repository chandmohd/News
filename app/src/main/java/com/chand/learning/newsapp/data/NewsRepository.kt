package com.chand.learning.newsapp.data

import com.chand.learning.newsapp.api.ApiService
import com.chand.learning.newsapp.api.SafeApiRequest

class NewsRepository(
    private val api:ApiService,
    private val param:HashMap<String,String>
):SafeApiRequest() {

    suspend fun getNewsHeadLines() = apiRequest { api.getHeadLines(param) }
}
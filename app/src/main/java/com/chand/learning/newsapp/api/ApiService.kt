package com.chand.learning.newsapp.api

import com.chand.learning.newsapp.data.NewsResponse
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
//import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface ApiService  {

    @GET("top-headlines")
    suspend fun getHeadLines(@QueryMap param:HashMap<String,String>):Response<NewsResponse>

    companion object{
        private const val BASE_URL = "https://newsapi.org/v2/"

        fun create(): ApiService {
            val logger = HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY }
            val client = OkHttpClient.Builder().addInterceptor(logger).build()

            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .client(client)
                .build()
                .create(ApiService::class.java)
        }
    }
}
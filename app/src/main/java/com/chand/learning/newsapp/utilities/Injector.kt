package com.chand.learning.newsapp.utilities

import com.chand.learning.newsapp.api.ApiService
import com.chand.learning.newsapp.data.NewsRepository
import com.chand.learning.newsapp.viewModels.NewsViewModelFactory

object Injector {
     fun getNewsFactory():NewsViewModelFactory {
        return NewsViewModelFactory(NewsRepository.getInstance(ApiService.create(), getParam()))
    }

    private fun getParam():HashMap<String,String>{
        val param = HashMap<String,String>()
        param[COUNTRY] = COUNTRY_NAME
        param[API] = API_KEY
        return param
    }
}
package com.chand.learning.newsapp.utilities

import androidx.fragment.app.Fragment
import com.chand.learning.newsapp.api.ApiService
import com.chand.learning.newsapp.data.AppDataBase
import com.chand.learning.newsapp.data.NewsRepository
import com.chand.learning.newsapp.viewModels.NewsViewModelFactory

object Injector {
     fun getNewsFactory(fragment: Fragment):NewsViewModelFactory {
        return NewsViewModelFactory(NewsRepository.getInstance(ApiService.create(),
            AppDataBase.getInstance(fragment.requireContext() ), getParam()))
    }

    private fun getParam():HashMap<String,String>{
        val param = HashMap<String,String>()
        param[COUNTRY] = COUNTRY_NAME
        param[API] = API_KEY
        return param
    }
}
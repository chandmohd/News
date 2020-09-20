package com.chand.learning.newsapp.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chand.learning.newsapp.data.Article
import com.chand.learning.newsapp.data.NewsRepository
import com.chand.learning.newsapp.utilities.Coroutines
import kotlinx.coroutines.Job

class NewsListViewModel(private val repository: NewsRepository) : ViewModel() {

    private val _news  =  MutableLiveData<List<Article>>()
    val news : LiveData<List<Article>>
        get() = _news
    private lateinit var job:Job

      fun getNewsHeadlines() {
        job = Coroutines.ioToMain({repository.getNewsHeadLines().articles},{_news.value = it})
    }

    override fun onCleared() {
        super.onCleared()
        if (::job.isInitialized) job.cancel()
    }
}
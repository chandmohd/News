package com.chand.learning.newsapp.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chand.learning.newsapp.data.Article
import com.chand.learning.newsapp.data.NewsRepository

class NewsListViewModel(
    private val repository: NewsRepository
) : ViewModel() {
}
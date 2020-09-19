package com.chand.learning.newsapp.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.chand.learning.newsapp.data.NewsRepository

@Suppress("UNCHECKED_CAST")
class NewsViewModelFactory(
    private val repository: NewsRepository
) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NewsListViewModel(repository) as T
    }

}
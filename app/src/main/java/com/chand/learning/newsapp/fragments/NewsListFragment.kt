package com.chand.learning.newsapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.chand.learning.newsapp.adapters.NewsAdapter
import com.chand.learning.newsapp.databinding.NewsListFragmentBinding
import com.chand.learning.newsapp.utilities.Injector
import com.chand.learning.newsapp.viewModels.NewsListViewModel

class NewsListFragment : Fragment() {
    private val viewModel :NewsListViewModel by viewModels { Injector.getNewsFactory(this) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = NewsListFragmentBinding.inflate(layoutInflater,container,false)
        context ?: return binding.root
        val adapter = NewsAdapter()
        binding.rvNews.adapter = adapter
        subscribeUi(adapter)
        return binding.root
    }


    private fun subscribeUi(adapter: NewsAdapter) {
        viewModel.getNewsHeadlines()
        viewModel.news.observe(viewLifecycleOwner) { news ->
            adapter.submitList(news)
        }
    }

}
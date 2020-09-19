package com.chand.learning.newsapp.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chand.learning.newsapp.R
import com.chand.learning.newsapp.viewModels.NewsDetailsViewModel

class NewsDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = NewsDetailsFragment()
    }

    private lateinit var viewModel: NewsDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.news_details_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(NewsDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
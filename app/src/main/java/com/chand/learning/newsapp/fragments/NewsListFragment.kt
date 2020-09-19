package com.chand.learning.newsapp.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.chand.learning.newsapp.R
import com.chand.learning.newsapp.api.ApiService
import com.chand.learning.newsapp.data.NewsRepository
import com.chand.learning.newsapp.utilities.API_KEY
import com.chand.learning.newsapp.viewModels.NewsListViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class NewsListFragment : Fragment() {

    companion object {
        fun newInstance() = NewsListFragment()
    }

    private lateinit var viewModel: NewsListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.news_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val param = HashMap<String,String>()
        param["country"] = "in"
        param["key"] = API_KEY
      val repo = NewsRepository(ApiService.create(),param)

        GlobalScope.launch(Dispatchers.Main) {
            val news = repo.getNewsHeadLines()
            Toast.makeText(activity, "${news.articles.toString()}", Toast.LENGTH_SHORT).show()
        }
//        viewModel = ViewModelProviders.of(this).get(NewsListViewModel::class.java)
    }

}
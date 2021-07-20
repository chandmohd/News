package com.chand.learning.newsapp.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.chand.learning.newsapp.R

class NewsDetailsFragmentDirections private constructor() {
  companion object {
    fun actionNewsDetailsFragmentToNewsListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_newsDetailsFragment_to_newsListFragment)
  }
}

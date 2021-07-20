package com.chand.learning.newsapp.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.chand.learning.newsapp.R
import com.chand.learning.newsapp.data.Article
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class NewsListFragmentDirections private constructor() {
  private data class ActionNewsListFragmentToNewsDetailsFragment(
    val article: Article
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_newsListFragment_to_newsDetailsFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(Article::class.java)) {
        result.putParcelable("article", this.article as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(Article::class.java)) {
        result.putSerializable("article", this.article as Serializable)
      } else {
        throw UnsupportedOperationException(Article::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  companion object {
    fun actionNewsListFragmentToNewsDetailsFragment(article: Article): NavDirections =
        ActionNewsListFragmentToNewsDetailsFragment(article)
  }
}

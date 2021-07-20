package com.chand.learning.newsapp.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.chand.learning.newsapp.data.Article
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class NewsDetailsFragmentArgs(
  val article: Article
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  fun toBundle(): Bundle {
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

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): NewsDetailsFragmentArgs {
      bundle.setClassLoader(NewsDetailsFragmentArgs::class.java.classLoader)
      val __article : Article?
      if (bundle.containsKey("article")) {
        if (Parcelable::class.java.isAssignableFrom(Article::class.java) ||
            Serializable::class.java.isAssignableFrom(Article::class.java)) {
          __article = bundle.get("article") as Article?
        } else {
          throw UnsupportedOperationException(Article::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__article == null) {
          throw IllegalArgumentException("Argument \"article\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"article\" is missing and does not have an android:defaultValue")
      }
      return NewsDetailsFragmentArgs(__article)
    }
  }
}

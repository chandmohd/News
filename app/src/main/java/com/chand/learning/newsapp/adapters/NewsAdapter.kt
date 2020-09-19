/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.chand.learning.newsapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.chand.learning.newsapp.data.Article
import com.chand.learning.newsapp.databinding.ItemNewsBinding
import com.chand.learning.newsapp.fragments.NewsListFragmentDirections

/**
 * Adapter for the [RecyclerView] in [NewsFragmentList].
 */
class NewsAdapter : ListAdapter<Article, RecyclerView.ViewHolder>(NewsDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return NewsViewHolder(
            ItemNewsBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val plant = getItem(position)
        (holder as NewsViewHolder).bind(plant)
    }

    class NewsViewHolder(
        private val binding: ItemNewsBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.setClickListener {
                binding.item?.let { news ->
                    navigateToPlant(news, it)
                }
            }
        }

        private fun navigateToPlant(
            article: Article,
            view: View
        ) {
            val direction = NewsListFragmentDirections.actionNewsListFragmentToNewsDetailsFragment(article)
            view.findNavController().navigate(direction)
        }

        fun bind(item: Article) {
            binding.apply {
                this.item = item
                executePendingBindings()
            }
        }
    }
}

private class NewsDiffCallback : DiffUtil.ItemCallback<Article>() {

    override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
        return oldItem.author == newItem.author
    }

    override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
        return oldItem == newItem
    }

}
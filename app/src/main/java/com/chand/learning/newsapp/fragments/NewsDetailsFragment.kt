package com.chand.learning.newsapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.chand.learning.newsapp.databinding.NewsDetailsFragmentBinding

class NewsDetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val args: NewsDetailsFragmentArgs by navArgs()
        val binding = NewsDetailsFragmentBinding.inflate(inflater, container, false).also {
            it.item = args.article
        }
        binding.ivBack.setOnClickListener { activity?.onBackPressed() }
        return binding.root
    }

}
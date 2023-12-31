package com.allaber.home.internal.presentation.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.allaber.home.R
import com.allaber.home.databinding.FragmentHomeBinding
import com.allaber.navigation.launchDeeplink
import com.allaber.navigation.link.IntroDeepLink

internal class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding: FragmentHomeBinding by viewBinding(
        FragmentHomeBinding::bind
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewsListener()
    }

    private fun setupViewsListener() {
        binding.textView.setOnClickListener {
            launchDeeplink(IntroDeepLink())
        }
    }
}

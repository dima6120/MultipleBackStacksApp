package com.example.multiplebackstacksapp.fragments.mainScreen.tabs.tab1

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.example.multiplebackstacksapp.fragments.base.BaseScreenFragment

class Tab1Screen1Fragment: BaseScreenFragment() {
    override val screenNumber: Int = 1
    override val tabNumber: Int = 1

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.back.isVisible = false
    }

    override fun onNextClick() {
        navController.navigate(Tab1Screen1FragmentDirections.toScreen2())
    }
}
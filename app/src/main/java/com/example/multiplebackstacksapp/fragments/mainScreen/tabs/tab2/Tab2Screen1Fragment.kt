package com.example.multiplebackstacksapp.fragments.mainScreen.tabs.tab2

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.example.multiplebackstacksapp.fragments.base.BaseScreenFragment

class Tab2Screen1Fragment: BaseScreenFragment() {
    override val screenNumber: Int = 1
    override val tabNumber: Int = 2

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.back.isVisible = false
    }

    override fun onNextClick() {
        navController.navigate(Tab2Screen1FragmentDirections.toScreen2())
    }
}
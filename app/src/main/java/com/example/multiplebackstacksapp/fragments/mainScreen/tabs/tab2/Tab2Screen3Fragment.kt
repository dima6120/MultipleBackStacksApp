package com.example.multiplebackstacksapp.fragments.mainScreen.tabs.tab2

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.example.multiplebackstacksapp.fragments.base.BaseScreenFragment

class Tab2Screen3Fragment: BaseScreenFragment() {
    override val screenNumber: Int = 3
    override val tabNumber: Int = 2

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.next.isVisible = false
    }

    override fun onBackClick() {
        navController.navigateUp()
    }
}
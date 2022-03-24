package com.example.multiplebackstacksapp.fragments.mainScreen.tabs.tab1

import com.example.multiplebackstacksapp.fragments.base.BaseScreenFragment

class Tab1Screen2Fragment: BaseScreenFragment() {
    override val screenNumber: Int = 2
    override val tabNumber: Int = 1

    override fun onNextClick() {
        navController.navigate(Tab1Screen2FragmentDirections.toScreen3())
    }

    override fun onBackClick() {
        navController.navigateUp()
    }
}
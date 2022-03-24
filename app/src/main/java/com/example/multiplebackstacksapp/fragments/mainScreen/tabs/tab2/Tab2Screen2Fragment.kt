package com.example.multiplebackstacksapp.fragments.mainScreen.tabs.tab2

import com.example.multiplebackstacksapp.fragments.base.BaseScreenFragment

class Tab2Screen2Fragment: BaseScreenFragment() {
    override val screenNumber: Int = 2
    override val tabNumber: Int = 2

    override fun onNextClick() {
        navController.navigate(Tab2Screen2FragmentDirections.toScreen3())
    }

    override fun onBackClick() {
        navController.navigateUp()
    }
}
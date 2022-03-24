package com.example.multiplebackstacksapp.fragments.mainScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.multiplebackstacksapp.R
import com.example.multiplebackstacksapp.databinding.FragmentMainBinding
import com.example.multiplebackstacksapp.fragments.base.BaseTabNavigationFragment

class MainScreenFragment: BaseTabNavigationFragment() {
    private lateinit var binding: FragmentMainBinding

    private val tab1 = Tab(TAB1_NAME, R.navigation.tab1_nav_graph)
    private val tab2 = Tab(TAB2_NAME, R.navigation.tab2_nav_graph)

    override val containerId: Int = R.id.mainScreenNavHostFragment
    override val tabs: List<Tab> = listOf(tab1, tab2)

    private lateinit var selectedTab: Tab

    private lateinit var tabButtons: Map<Tab, Button>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentMainBinding.inflate(inflater).also { binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tabButtons = mapOf(
            tab1 to binding.tab1,
            tab2 to binding.tab2
        )

        selectedTab = tabs[0]
        selectTab(tabs[0])

        binding.tab1.setOnClickListener {
            if (selectedTab != tab1) {
                selectTab(tab1)
            }
        }

        binding.tab2.setOnClickListener {
            if (selectedTab != tab2) {
                selectTab(tab2)
            }
        }
    }

    override fun tabSelected(tab: Tab) {
        selectedTab = tab

        tabButtons.forEach { it.value.isSelected = it.key == selectedTab }
    }

    companion object {
        private const val TAB1_NAME = "tab1"
        private const val TAB2_NAME = "tab2"
    }
}
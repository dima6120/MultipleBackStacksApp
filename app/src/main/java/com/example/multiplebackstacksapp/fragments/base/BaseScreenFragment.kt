package com.example.multiplebackstacksapp.fragments.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.multiplebackstacksapp.R
import com.example.multiplebackstacksapp.databinding.FragmentScreenBinding

abstract class BaseScreenFragment: Fragment() {
    protected lateinit var binding: FragmentScreenBinding

    protected val navController: NavController
        get() = findNavController()

    abstract val screenNumber: Int
    abstract val tabNumber: Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentScreenBinding.inflate(inflater).also { binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            screenName.text = getString(R.string.screenName, tabNumber, screenNumber)

            next.setOnClickListener { onNextClick() }

            back.setOnClickListener { onBackClick() }
        }
    }

    open fun onNextClick() {}
    open fun onBackClick() {}
}
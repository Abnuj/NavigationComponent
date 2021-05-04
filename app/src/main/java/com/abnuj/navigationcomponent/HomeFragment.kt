package com.abnuj.navigationcomponent

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.abnuj.navigationcomponent.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    lateinit var homeBinding: FragmentHomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()
        Log.d("current", navController.currentBackStackEntry.toString())
        homeBinding = FragmentHomeBinding.bind(view)

        // we get action direction
        val navOption: NavOptions = NavOptions.Builder().build()

// pass arguements bw differenct fragments
        val action: NavDirections =
            HomeFragmentDirections.actionHomeFragmentToViewBalanceFragment("Ambuj Pandey")

        // Navigation ui class in navController

        // accessing global action
        val settingFragmentDirections = HomeFragmentDirections.actionGlobalSettingFragment()
        homeBinding.homebtn.setOnClickListener {
            navController.navigate(action)
//            navController.navigate(settingFragmentDirections)
        }
    }
}
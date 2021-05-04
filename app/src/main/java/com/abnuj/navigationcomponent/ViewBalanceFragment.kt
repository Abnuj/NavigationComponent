package com.abnuj.navigationcomponent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_view_balance.*

class ViewBalanceFragment : Fragment(R.layout.fragment_view_balance) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()
        val args = ViewBalanceFragmentArgs.fromBundle(requireArguments())

        // receive our arguments
        // in this case it is my name
        nametv.text = args.name

        balancebtn.setOnClickListener {
        navController.popBackStack(R.id.homeFragment,false)
//            navController.navigate(R.id.action_viewBalanceFragment_to_homeFragment)
        }
    }
}
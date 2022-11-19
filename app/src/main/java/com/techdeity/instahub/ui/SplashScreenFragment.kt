package com.techdeity.instahub.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.techdeity.instahub.R
import com.techdeity.instahub.databinding.FragmentSplashScreenBinding

class SplashScreenFragment : Fragment() {


    private var _binding :FragmentSplashScreenBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

    _binding=FragmentSplashScreenBinding.inflate(inflater,container,false)

    return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Handler(Looper.getMainLooper()).postDelayed({
                context?. let{
                    findNavController().navigate(R.id.action_splashScreenFragment_to_mainFragment
                    ,null,NavOptions.Builder().setPopUpTo(R.id.splashScreenFragment,true).build())
                }
        },2500)
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding= null
    }

}
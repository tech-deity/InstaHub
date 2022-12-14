package com.techdeity.instahub.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.techdeity.instahub.R
import com.techdeity.instahub.databinding.FragmentSignupBinding

class SignupFragment : Fragment() {


    private var _binding :FragmentSignupBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSignupBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
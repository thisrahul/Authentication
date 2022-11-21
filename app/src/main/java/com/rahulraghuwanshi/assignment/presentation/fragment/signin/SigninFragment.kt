package com.rahulraghuwanshi.assignment.presentation.fragment.signin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rahulraghuwanshi.assignment.R
import com.rahulraghuwanshi.assignment.databinding.FragmentSigninBinding

class SigninFragment : Fragment() {

    private lateinit var binding: FragmentSigninBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSigninBinding.inflate(inflater,container,false)
        return binding.root
    }
}
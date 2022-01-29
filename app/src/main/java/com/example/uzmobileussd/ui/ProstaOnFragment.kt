package com.example.uzmobileussd.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.uzmobileussd.R
import com.example.uzmobileussd.databinding.FragmentProstaOnBinding


class ProstaOnFragment : Fragment() {
private lateinit var binding:FragmentProstaOnBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentProstaOnBinding.inflate(inflater, container, false)

        binding.nazad.setOnClickListener {
            findNavController().navigate(R.id.thirdFragment)
        }
        return binding.root
    }

}
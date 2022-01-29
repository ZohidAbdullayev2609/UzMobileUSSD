package com.example.uzmobileussd.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.uzmobileussd.R
import com.example.uzmobileussd.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {
    private lateinit var binding: FragmentThirdBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentThirdBinding.inflate(inflater, container, false)

        binding.prostaOn.setOnClickListener {
            findNavController().navigate(R.id.prostaOnFragment2)
        }

        binding.internet.setOnClickListener {
            findNavController().navigate(R.id.homeInternetFragment)
        }

        binding.smslar.setOnClickListener {
            findNavController().navigate(R.id.homeSmsFragment)
        }

        binding.tarif.setOnClickListener {
            findNavController().navigate(R.id.tariflarFragment)
        }

        binding.kodlar.setOnClickListener {
            findNavController().navigate(R.id.USSDFragment2)
        }

        binding.xizmat.setOnClickListener {
            findNavController().navigate(R.id.xizmatlarFragment)
        }

        return binding.root
    }

}
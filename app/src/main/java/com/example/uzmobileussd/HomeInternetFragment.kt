package com.example.uzmobileussd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TableLayout
import androidx.navigation.fragment.findNavController
import com.example.uzmobileussd.adapter.viewPagerAdapter
import com.example.uzmobileussd.data.Entrance
import com.example.uzmobileussd.databinding.FragmentHomeInternetBinding
import com.example.uzmobileussd.internetPaketlari.HaftalikFragment
import com.example.uzmobileussd.internetPaketlari.KunlikFragment
import com.example.uzmobileussd.internetPaketlari.OylikFragment
import com.google.android.material.tabs.TabLayoutMediator

class HomeInternetFragment : Fragment() {
    private lateinit var binding: FragmentHomeInternetBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentHomeInternetBinding.inflate(inflater, container, false)

        val list = arrayListOf(
            KunlikFragment(),
            HaftalikFragment(),
            OylikFragment()
        )

        binding.viewPager.adapter =
            viewPagerAdapter(list, requireActivity().supportFragmentManager, lifecycle)
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tablelayout, postion ->

        }.attach()

        binding.tabLayout.getTabAt(0)?.setText(Entrance.values().get(0).title)
        binding.tabLayout.getTabAt(1)?.setText(Entrance.values().get(1).title)
        binding.tabLayout.getTabAt(2)?.setText(Entrance.values().get(2).title)

        binding.left.setOnClickListener {
            findNavController().navigate(R.id.thirdFragment)
        }

        return binding.root
    }

}
package com.example.uzmobileussd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.uzmobileussd.adapter.viewPagerAdapter
import com.example.uzmobileussd.data.Entrance
import com.example.uzmobileussd.databinding.FragmentHomeInternetBinding
import com.example.uzmobileussd.databinding.FragmentHomeSmsBinding
import com.example.uzmobileussd.internetPaketlari.HaftalikFragment
import com.example.uzmobileussd.internetPaketlari.KunlikFragment
import com.example.uzmobileussd.internetPaketlari.OylikFragment
import com.example.uzmobileussd.smsPaketlari.HaftalikSmsFragment
import com.example.uzmobileussd.smsPaketlari.KunlikSmsFragment
import com.example.uzmobileussd.smsPaketlari.OylikSmsFragment
import com.google.android.material.tabs.TabLayoutMediator


class HomeSmsFragment : Fragment() {
    private lateinit var binding: FragmentHomeSmsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentHomeSmsBinding.inflate(inflater, container, false)

        val list = arrayListOf(
            KunlikSmsFragment(),
            HaftalikSmsFragment(),
            OylikSmsFragment()
        )

        binding.viewPager2.adapter =
            viewPagerAdapter(list, requireActivity().supportFragmentManager, lifecycle)
        TabLayoutMediator(binding.tabLayout2, binding.viewPager2) { tablelayout, postion ->

        }.attach()

        binding.tabLayout2.getTabAt(0)?.setText(Entrance.values().get(0).title)
        binding.tabLayout2.getTabAt(1)?.setText(Entrance.values().get(1).title)
        binding.tabLayout2.getTabAt(2)?.setText(Entrance.values().get(2).title)

        binding.leftsms.setOnClickListener {
            findNavController().navigate(R.id.thirdFragment)
        }

        return binding.root
    }


}
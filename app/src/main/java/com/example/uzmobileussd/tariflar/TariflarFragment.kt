package com.example.uzmobileussd.tariflar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.uzmobileussd.R
import com.example.uzmobileussd.adapter.MyRecycleAdapter
import com.example.uzmobileussd.databinding.FragmentTariflarBinding
import com.example.uzmobileussd.model.InternetTariflari

class TariflarFragment : Fragment() {

    private lateinit var binding:FragmentTariflarBinding
    private lateinit var list: ArrayList<InternetTariflari>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentTariflarBinding.inflate(inflater, container, false)

        initList1()

        binding.left.setOnClickListener {
            findNavController().navigate(R.id.thirdFragment)
        }

        binding.rv2.adapter = MyRecycleAdapter(list)

        return binding.root
    }

    private fun initList1() {
        list = ArrayList()
        for (i in 0 until 5) {
            list.add(
                InternetTariflari(
                    R.drawable.logo,
                    "Oddiy 10",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
            list.add(
                InternetTariflari(
                    R.drawable.logo,
                    "Delovoy",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )

            list.add(
                InternetTariflari(
                    R.drawable.logo,
                    "Komfort",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
            list.add(
                InternetTariflari(
                    R.drawable.logo,
                    "Bolajon",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
            list.add(
                InternetTariflari(
                    R.drawable.logo,
                    "Yoshlar",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
            list.add(
                InternetTariflari(
                    R.drawable.logo,
                    "Traffic",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
            list.add(
                InternetTariflari(
                    R.drawable.logo,
                    "Traffic 2",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
        }
    }


}
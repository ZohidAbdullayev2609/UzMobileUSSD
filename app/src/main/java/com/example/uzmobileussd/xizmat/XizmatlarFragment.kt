package com.example.uzmobileussd.xizmat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.uzmobileussd.R
import com.example.uzmobileussd.adapter.MyRecycleAdapter
import com.example.uzmobileussd.databinding.FragmentXizmatlarBinding
import com.example.uzmobileussd.model.InternetTariflari

class XizmatlarFragment : Fragment() {

  private lateinit var binding: FragmentXizmatlarBinding
  private lateinit var list:ArrayList<InternetTariflari>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentXizmatlarBinding.inflate(inflater, container, false)

        initList()

        binding.left.setOnClickListener {
            findNavController().navigate(R.id.thirdFragment)
        }

        binding.rv2.adapter = MyRecycleAdapter(list)

        return binding.root
    }

    private fun initList() {
        list = ArrayList()
        for (i in 0 until 5) {
            list.add(
                InternetTariflari(
                    R.drawable.logo,
                    "LTE 4G",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
            list.add(
                InternetTariflari(
                    R.drawable.logo,

                    "Men kimman",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )

            list.add(
                InternetTariflari(
                    R.drawable.logo,

                    "Menga qo'ng'iroq qiling",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
            list.add(
                InternetTariflari(
                    R.drawable.logo,

                    "Xisobni to'ldirish",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
            list.add(
                InternetTariflari(
                    R.drawable.logo,

                    "Mobil anons",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
            list.add(
                InternetTariflari(
                    R.drawable.logo,
                    "Play mobile",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
            list.add(
                InternetTariflari(
                    R.drawable.logo,
                    "Ovozli pochta",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
        }
    }


}
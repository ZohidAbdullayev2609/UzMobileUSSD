package com.example.uzmobileussd.ussd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.uzmobileussd.R
import com.example.uzmobileussd.adapter.MyRecycleAdapter
import com.example.uzmobileussd.databinding.FragmentUSSDBinding
import com.example.uzmobileussd.model.InternetTariflari

class USSDFragment : Fragment() {

    private lateinit var binding:FragmentUSSDBinding
    private lateinit var list:ArrayList<InternetTariflari>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentUSSDBinding.inflate(inflater, container, false)

        initList()

        binding.rv2.adapter = MyRecycleAdapter(list)

        binding.left.setOnClickListener {
            findNavController().navigate(R.id.thirdFragment)
        }

        return binding.root
    }

    private fun initList() {
        list = ArrayList()
        for (i in 0 until 5) {
            list.add(
                InternetTariflari(
                    R.drawable.yuzzikki,

                    "Balans",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
            list.add(
                InternetTariflari(
                    R.drawable.yuztort,

                    "Mening raqamim",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )

            list.add(
                InternetTariflari(
                    R.drawable.birtorttort,

                    "Menga qo'ng'iroq qiling",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
            list.add(
                InternetTariflari(
                    R.drawable.birtortbir,

                    "Boshqa raqamga yo'naltirish",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
            list.add(
                InternetTariflari(
                    R.drawable.tortbirbir,

                    "Vaqtincha aloqada emasman",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
            list.add(
                InternetTariflari(
                    R.drawable.beshuchbesh,

                    "Ko'ngilochar chat",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
            list.add(
                InternetTariflari(
                    R.drawable.uchtabir,

                    "Men kimman",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
            list.add(
                InternetTariflari(
                    R.drawable.toqsonolti,

                    "Mega boom",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
        }
    }

}
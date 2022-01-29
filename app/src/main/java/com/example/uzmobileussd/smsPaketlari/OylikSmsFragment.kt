package com.example.uzmobileussd.smsPaketlari

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.example.uzmobileussd.R
import com.example.uzmobileussd.adapter.MyRecycleAdapter
import com.example.uzmobileussd.databinding.FragmentOylikSmsBinding
import com.example.uzmobileussd.model.InternetTariflari

class OylikSmsFragment : Fragment() {

private lateinit var binding: FragmentOylikSmsBinding
private lateinit var list: ArrayList<InternetTariflari>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentOylikSmsBinding.inflate(inflater, container, false)

        initList1()

        binding.rv1.adapter = MyRecycleAdapter(list)

        return binding.root
    }

    private fun initList1() {
        list = ArrayList()
        for (i in 0 until 5) {
            list.add(
                InternetTariflari(
                    R.drawable.ic_bir,

                    "SMS 10",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
            list.add(
                InternetTariflari(
                    R.drawable.ic_ikki,

                    "SMS 20",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )

            list.add(
                InternetTariflari(
                    R.drawable.ic_ikkibesh,

                    "SMS 25",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
            list.add(
                InternetTariflari(
                    R.drawable.ic_elliksvg,

                    "SMS 50",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
            list.add(
                InternetTariflari(
                    R.drawable.ic_yuzsvg,

                    "SMS 100",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
            list.add(
                InternetTariflari(
                    R.drawable.ic_beshyuzsvg,

                    "SMS 500",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
        }
    }

}
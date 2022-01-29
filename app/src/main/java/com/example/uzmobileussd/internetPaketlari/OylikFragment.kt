package com.example.uzmobileussd.internetPaketlari

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.example.uzmobileussd.R
import com.example.uzmobileussd.adapter.MyRecycleAdapter
import com.example.uzmobileussd.databinding.FragmentOylikBinding
import com.example.uzmobileussd.model.InternetTariflari

class OylikFragment : Fragment() {
    private lateinit var binding: FragmentOylikBinding
    private lateinit var list: ArrayList<InternetTariflari>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentOylikBinding.inflate(inflater, container, false)

        initList()

        binding.rv.adapter = MyRecycleAdapter(list)

        return binding.root
    }

    private fun initList() {
        list = ArrayList()
        for (i in 0 until 5) {
            list.add(
                InternetTariflari(
                    R.drawable.ic_elliksvg,

                    "50 MB",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
            list.add(
                InternetTariflari(
                    R.drawable.ic_yuzsvg,

                    "100 MB",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )

            list.add(
                InternetTariflari(
                    R.drawable.ic_yuzelliksvg,

                    "150 MB",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
            list.add(
                InternetTariflari(
                    R.drawable.ic_beshyuzsvg,

                    "500 MB",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
            list.add(
                InternetTariflari(
                    R.drawable.ic_minsvg,

                    "1000 MB",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
            list.add(
                InternetTariflari(
                    R.drawable.ic_ikkigb,

                    "2 GB",
                    "Agar abonentda ADSL texnologiyasidan foydalangan holda \n" +
                            "IPTV xizmati mavjud bo'lsa, tarif rejasida ko'rsatilgan tezlikni \n" +
                            "ta'minlash uchun texnik imkoniyat UZTELECOM savdo \n" +
                            "idorasiga yozma ariza bilan belgilanadi."
                )
            )
        }
    }

}
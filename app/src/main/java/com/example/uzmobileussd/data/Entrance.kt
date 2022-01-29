package com.example.uzmobileussd.data

import androidx.annotation.StringRes
import com.example.uzmobileussd.R

enum class Entrance(

    @StringRes var title: Int
) {
    KUNLIK(R.string.kunlik),
    HAFTALIK(R.string.haftalik),
    OYLIK(R.string.oylik)
}
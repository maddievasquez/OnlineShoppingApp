package com.maddie.onlineshoppingapp.utils

import android.content.Context
import android.content.pm.Attribution
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class OSAEditText(context: Context, attrs: AttributeSet) :AppCompatEditText(context, attrs){
    init {
        applyFont()

    }
    private fun applyFont() {

        val typeface: Typeface =
            Typeface.createFromAsset(context.assets, "Montserrat-Bold.tff")
        setTypeface(typeface)

    }
}
package com.pegasus.toasterlibrary

import android.content.Context
import android.widget.Toast

object ToasterLibrary {

    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}
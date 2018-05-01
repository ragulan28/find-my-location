package com.ragulan.findmylocation.findmylocation

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences

class UserData(context: Context) {
    private var context: Context? = context
    private var sharedRef: SharedPreferences? = null


    init {
        this.sharedRef = context.getSharedPreferences("userData" , Context.MODE_PRIVATE)
    }

    fun savePhone(phoneNumber: String) {
        val editor = sharedRef!!.edit()
        editor.putString("phoneNumber" , phoneNumber)
        editor.commit()
    }

    fun loadPhoneNumber(): String {
        val phoneNumber = sharedRef!!.getString("phoneNumber" , "empty")
        if (phoneNumber == "empty") {
            val intent = Intent(context , LoginActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context!!.startActivity(intent)
        }
        return phoneNumber
    }

    init {
        this.sharedRef = context.getSharedPreferences("userData" , Context.MODE_PRIVATE)
    }
}
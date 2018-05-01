package com.ragulan.findmylocation.findmylocation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun benRegisterEvent(view: View) {
        val userData = UserData(this)
        userData.savePhone(etPhoneNumber.text.toString())
        finish()
    }
}

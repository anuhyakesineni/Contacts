package com.example.contacts

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.login_home_screen.*

class LoginHomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_home_screen)

        add_contact.setOnClickListener {
            var i = Intent(this,AddContact::class.java)
            startActivity(i)
        }

        display_contacts.setOnClickListener {
            var i = Intent(this,DisplayContacts::class.java)
            startActivity(i)
        }

        //delete contact button


        sign_out.setOnClickListener {
            var i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }

    }
}
package com.example.contacts

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            register.setOnClickListener{
                var i = Intent(this,Register::class.java)
                startActivity(i)
            }

            login.setOnClickListener{
                var i = Intent(this,LoginHomeScreen::class.java)
                startActivity(i)
            }
    }
}
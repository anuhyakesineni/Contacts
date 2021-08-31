package com.example.contacts

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.add_contact.*


class AddContact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_contact)

        submit.setOnClickListener {
            Toast.makeText(this,"Contact added successfully!",Toast.LENGTH_SHORT).show()
        }

    }
}
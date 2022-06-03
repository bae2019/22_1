package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_main_button.*


class MainButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_button)

        mainbtn1.setOnClickListener {
            startActivity(Intent(this, Notice::class.java))
        }
        mainbtn2.setOnClickListener {
            startActivity(Intent(this, Lab::class.java))
        }
        mainbtn3.setOnClickListener {
            startActivity(Intent(this, Calendar::class.java))
        }
        mainbtn4.setOnClickListener {
            startActivity(Intent(this, Office::class.java))
        }
    }

}
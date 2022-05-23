package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {    //oncreate : 앱 최초실행시 수행
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  //xml화면 뷰 연결
        Handler().postDelayed({ startActivity(Intent(this, MainButton::class.java)) }, 1500L)
        imageView.setOnClickListener {
            startActivity(Intent(this, MainButton::class.java))
        }
    }
}
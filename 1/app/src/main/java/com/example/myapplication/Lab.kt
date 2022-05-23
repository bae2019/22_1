package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import com.example.myapplication.ui.extra.professor_webview
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_lab.*


class Lab : AppCompatActivity() {

    lateinit var navigationView: NavigationView
    lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab)

        professor_name.setOnClickListener {
            startActivity(Intent(this, professor_webview::class.java)) //버튼 클릭시 웹뷰로 이동
        }
    }
}
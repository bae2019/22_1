package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.ui.extra.ProfileAdapter
import com.example.myapplication.ui.extra.professor_profile
import com.example.myapplication.ui.extra.professor_webview
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_lab.*
import kotlinx.android.synthetic.main.activity_main_button.*


class Lab : AppCompatActivity() {

    lateinit var navigationView: NavigationView
    lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab)

        val profileList = arrayListOf(
            professor_profile("교수님1","실시간 시스템 연구실","IT1-503"),
            professor_profile("교수님2","실시간 시스템 연구실","IT1-503"),
            professor_profile("교수님3","실시간 시스템 연구실","IT1-503"),
            professor_profile("교수님4","실시간 시스템 연구실","IT1-503"),
            professor_profile("교수님5","실시간 시스템 연구실","IT1-503"),
            professor_profile("교수님6","실시간 시스템 연구실","IT1-503"),
            professor_profile("교수님7","실시간 시스템 연구실","IT1-503"),
            professor_profile("교수님8","실시간 시스템 연구실","IT1-503"),
            professor_profile("교수님9","실시간 시스템 연구실","IT1-503"),
            professor_profile("교수님10","실시간 시스템 연구실","IT1-503"),
            professor_profile("교수님11","실시간 시스템 연구실","IT1-503"),
       )

        professor_list.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        professor_list.setHasFixedSize(true)

        professor_list.adapter = ProfileAdapter(profileList)

        button_test.setOnClickListener {
            startActivity(Intent(this, professor_webview::class.java))
        }
    }
}
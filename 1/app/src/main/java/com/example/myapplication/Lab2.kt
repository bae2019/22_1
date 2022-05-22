package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_lab.*

class Lab2 : AppCompatActivity() {

    lateinit var navigationView: NavigationView
    lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab2)


        val lablist2 = arrayListOf(
            InLab(Pname = "권혁주", Lname = "BK21계약교수", Laddress = "IT1-310", Laddress2 = " "),
            InLab(Pname = "권혜진", Lname = "강의초빙교수", Laddress = "IT1-821", Laddress2 = " "),
            InLab(Pname = "김종화", Lname = "강의초빙교수", Laddress = "IT3-307", Laddress2 = " "),
            InLab(Pname = "김찬용", Lname = "강의초빙교수", Laddress = "E7-309", Laddress2 = " "),
            InLab(Pname = "김호희", Lname = "강의초빙교수", Laddress = "IT3-405", Laddress2 = " "),
            InLab(Pname = "말렘 시바 프래탑 래디", Lname = "BK21계약교수", Laddress = "IT3-607", Laddress2 = " "),
            InLab(Pname = "박은진", Lname = "강의초빙교수", Laddress = "IT3-307", Laddress2 = " "),
            InLab(Pname = "시암 쿠마르 피다파시", Lname = "BK21계약교수", Laddress = "IT3-314", Laddress2 = " "),
            InLab(Pname = "윤병주", Lname = "강의초빙교수", Laddress = "IT3-409A", Laddress2 = " "),
            InLab(Pname = "이경숙", Lname = "강의초빙교수", Laddress = "IT3-405", Laddress2 = " "),
            InLab(Pname = "최영숙", Lname = "강의초빙교수", Laddress = "IT3-405", Laddress2 = " ")
        )
    }
}
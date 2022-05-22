package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.navi_main.*
import kotlinx.android.synthetic.main.toolbar.*

class Notice : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notice)
/*
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.pinclipart_com_menu_clip_art_5328945)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        //supportActionBar?.setTitle("공지사항")
        nav_view.setNavigationItemSelectedListener(this)*/

    }
/*
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home->{
                navi_main.openDrawer(GravityCompat.START)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            //R.id.navbtn1->startActivity(Intent(this, Notice::class.java))
            //R.id.navbtn2->startActivity(Intent(this, Lab::class.java))
            R.id.navbtn3-> Toast.makeText(this,"학사일정 연결", Toast.LENGTH_SHORT).show()
           // R.id.navbtn4->startActivity(Intent(this, office::class.java))
        }
        return false
    }

    override fun onBackPressed() {
        if(navi_main.isDrawerOpen(GravityCompat.START)){
            navi_main.closeDrawers()
        }else {
            super.onBackPressed()
        }
    }*/

}
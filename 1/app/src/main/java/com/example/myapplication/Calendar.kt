package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.calendar.*
import kotlinx.android.synthetic.main.toolbar.*

class Calendar : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calendar)

        //navigation drawer
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.pinclipart_com_menu_clip_art_5328945)
        supportActionBar?.setDisplayShowCustomEnabled(false)

        navbtn.setOnClickListener {
            calendar.openDrawer(GravityCompat.START)
        }
        bellicon.setOnClickListener {
            startActivity(Intent(this, Keyword::class.java))
            finish()
        }

        notice_navigationView.setNavigationItemSelectedListener(this)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home->{
                calendar.openDrawer(GravityCompat.START)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.navbtn1->{startActivity(Intent(this, Notice::class.java))
                finish()}
            R.id.navbtn2->{startActivity(Intent(this, Lab::class.java))
                finish()}
            R.id.navbtn3->calendar.closeDrawers()
            R.id.navbtn4->{startActivity(Intent(this, Office::class.java))
                finish()}
        }
        return false
    }

    override fun onBackPressed() {
        if(calendar.isDrawerOpen(GravityCompat.START)){
            calendar.closeDrawers()
        }else {
            finish()
            }
    }
}
package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_notice_content.*
import kotlinx.android.synthetic.main.notice_content.*
import kotlinx.android.synthetic.main.toolbar.*

class Notice_Content : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.notice_content)

        //목록으로 돌아가기 버튼
        button.setOnClickListener {
            startActivity(Intent(this, Notice::class.java))
        }

        //navigation drawer
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.pinclipart_com_menu_clip_art_5328945)
        supportActionBar?.setDisplayShowCustomEnabled(false)

        navbtn.setOnClickListener {
            notice_content.openDrawer(GravityCompat.START)
        }
        bellicon.setOnClickListener {
            startActivity(Intent(this, Keyword::class.java))
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home->{
                notice_content.openDrawer(GravityCompat.START)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.navbtn1->startActivity(Intent(this, Notice::class.java))
            R.id.navbtn2->startActivity(Intent(this, Lab::class.java))
            R.id.navbtn3-> Toast.makeText(this,"학사일정 연결", Toast.LENGTH_SHORT).show()
            R.id.navbtn4->startActivity(Intent(this, Office::class.java))
        }
        return false
    }

    override fun onBackPressed() {
        if(notice_content.isDrawerOpen(GravityCompat.START)){
            notice_content.closeDrawers()
        }else {
            super.onBackPressed()
        }
    }


}
package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.core.view.GravityCompat
import com.example.myapplication.Fragment.*
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_lab.*
import kotlinx.android.synthetic.main.lab.*
import kotlinx.android.synthetic.main.toolbar.*


class Lab : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lab)

        setFrag(0)

        fragbtn0.setOnClickListener { setFrag(0) }
        fragbtn1.setOnClickListener { setFrag(1) }
        fragbtn2.setOnClickListener { setFrag(2) }
        fragbtn3.setOnClickListener { setFrag(3) }
        fragbtn4.setOnClickListener { setFrag(4) }
        fragbtn5.setOnClickListener { setFrag(5) }
        fragbtn6.setOnClickListener { setFrag(6) }
        fragbtn7.setOnClickListener { setFrag(7) }
        fragbtn8.setOnClickListener { setFrag(8) }
        fragbtn9.setOnClickListener { setFrag(9) }
        fragbtn10.setOnClickListener { setFrag(10) }

        //navigation drawer
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.pinclipart_com_menu_clip_art_5328945)
        supportActionBar?.setDisplayShowCustomEnabled(false)

        navbtn.setOnClickListener {
            lab.openDrawer(GravityCompat.START)
        }
        bellicon.setOnClickListener {
            startActivity(Intent(this, Keyword::class.java))
            finish()
        }

        lab_navigationView.setNavigationItemSelectedListener(this)

    }

    private fun setFrag(fragNum : Int){
        val ft = supportFragmentManager.beginTransaction()
        when(fragNum){
            0 -> { ft.replace(R.id.main_frame, Fragment0()).commit() }
            1 -> { ft.replace(R.id.main_frame, Fragment1()).commit() }
            2 -> { ft.replace(R.id.main_frame, Fragment2()).commit() }
            3 -> { ft.replace(R.id.main_frame, Fragment3()).commit() }
            4 -> { ft.replace(R.id.main_frame, Fragment4()).commit() }
            5 -> { ft.replace(R.id.main_frame, Fragment5()).commit() }
            6 -> { ft.replace(R.id.main_frame, Fragment6()).commit() }
            7 -> { ft.replace(R.id.main_frame, Fragment7()).commit() }
            8 -> { ft.replace(R.id.main_frame, Fragment8()).commit() }
            9 -> { ft.replace(R.id.main_frame, Fragment9()).commit() }
            10 -> { ft.replace(R.id.main_frame, Fragment10()).commit() }
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home->{
                lab.openDrawer(GravityCompat.START)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.navbtn1->{startActivity(Intent(this, Notice::class.java))
                finish()}
            R.id.navbtn2->lab.closeDrawers()
            R.id.navbtn3->{startActivity(Intent(this, Calendar::class.java))
                finish()}
            R.id.navbtn4->{startActivity(Intent(this, Office::class.java))
                finish()}
        }
        return false
    }

    override fun onBackPressed() {
        if(lab.isDrawerOpen(GravityCompat.START)){
            lab.closeDrawers()
        }else {
            finish()
        }
    }

}
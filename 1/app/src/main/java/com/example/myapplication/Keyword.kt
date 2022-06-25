package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.example.myapplication.R
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.Task
import com.google.android.material.navigation.NavigationView
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.ktx.messaging
import kotlinx.android.synthetic.main.activity_keyword.*
import kotlinx.android.synthetic.main.keyword.*
import kotlinx.android.synthetic.main.toolbar.*


class Keyword : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.keyword)

        val TAG:String = ""

        //navigation drawer
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.pinclipart_com_menu_clip_art_5328945)
        supportActionBar?.setDisplayShowCustomEnabled(false)

        navbtn.setOnClickListener {
            keyword.openDrawer(GravityCompat.START)
        }
        keyword_navigationView.setNavigationItemSelectedListener(this)

        //키워드 등록하기 DB,화면
        val pref = this.getSharedPreferences("username", Context.MODE_PRIVATE)

        val username = pref.getString("username","ExtraUser")
        val database = FirebaseDatabase.getInstance().getReference("token")

        val list = mutableListOf(
            ""
        )

        val adapter: ArrayAdapter<String> =
            ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list)
        list.removeAt(0)
        adapter.notifyDataSetChanged()

        keyword_listView.adapter = adapter

        keyword_listView.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                var usr_keyword_del: String = list[position]
                list.removeAt(position)
                adapter.notifyDataSetChanged()
                if (username != null) {
                    database.child(username).child(usr_keyword_del).removeValue()
                }
            }

        keywordbtn.setOnClickListener {
            var usr_keyword = edit_keyword.text.toString()
            if (usr_keyword.isNotEmpty()) {
                list.add(usr_keyword)
                adapter.notifyDataSetChanged()
                if (username != null) {
                    database.child(username).child(usr_keyword).setValue(usr_keyword)
                }
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home->{
                keyword.openDrawer(GravityCompat.START)
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
            R.id.navbtn3->{startActivity(Intent(this, Calendar::class.java))
                finish()}
            R.id.navbtn4->{startActivity(Intent(this, Office::class.java))
                finish()}
        }
        return false
    }


    override fun onBackPressed() {
        if(keyword.isDrawerOpen(GravityCompat.START)){
            keyword.closeDrawers()
        }else {
            finish()
        }
    }

}
package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.SearchView
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.ui.extra.ListViewModel
import com.example.myapplication.ui.extra.notice_adapter
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_notice.*
import kotlinx.android.synthetic.main.notice.*
import kotlinx.android.synthetic.main.toolbar.*
import java.util.Locale.filter

class Notice : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    companion object{
        var count : Int = 0 //전역변수로 count 선언
    }
    private lateinit var adapter: notice_adapter
    private val viewModel by lazy {
        ViewModelProvider(this).get(ListViewModel::class.java)
    }

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.notice)

        /*******************navigation drawer***********************/
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.pinclipart_com_menu_clip_art_5328945)
        supportActionBar?.setDisplayShowCustomEnabled(false)

        navbtn.setOnClickListener {
            notice.openDrawer(GravityCompat.START)
        }
        bellicon.setOnClickListener {
            startActivity(Intent(this, Keyword::class.java))
        }
        /************************************************************/

        adapter = notice_adapter(this)
        val recyclerView : RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
            observerData() //실시간 데이터 업데이트

            //검색리스너
            search_notice.setOnQueryTextListener(object: androidx.appcompat.widget.SearchView.OnQueryTextListener{
                override fun onQueryTextSubmit(query: String?): Boolean {
                    return false
                }
                override fun onQueryTextChange(newText: String?): Boolean {
                    Log.d("onQueryTextChange", "query: " + newText)
                    adapter.filter.filter(newText)
                    return false
                }
            })
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home->{
                notice.openDrawer(GravityCompat.START)
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
        if(notice.isDrawerOpen(GravityCompat.START)){
            notice.closeDrawers()
        }else {
            super.onBackPressed()
        }
    }
    fun observerData(){
        viewModel.fetchData().observe(this, Observer {
            adapter.setListData(it)
            adapter.notifyDataSetChanged()
        })
    }
}
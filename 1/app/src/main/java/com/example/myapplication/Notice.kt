package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_notice.*
import kotlinx.android.synthetic.main.notice.*
import kotlinx.android.synthetic.main.toolbar.*

class Notice : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

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
        tempbtn.setOnClickListener {
            startActivity(Intent(this, Notice_Content::class.java))
        }
        /***********************************************************/
//        val db = FirebaseFirestore.getInstance();

//        var t_hashMap = HashMap<String, Any>()
//
//        t_hashMap.put("name","김정탁")
//        t_hashMap.put("token","123456");
//
//        db.collection("users").document("2018112138").set(t_hashMap)
//

//        db.collection("users")   // 작업할 컬렉션
//            .get()      // 문서 가져오기
//            .addOnSuccessListener { result ->
//                // 성공할 경우
//                for (document in result) {  // 가져온 문서들은 result에 들어감
////                   Toast.makeText(this, document["token"].toString(), Toast.LENGTH_SHORT).show()
//                    if(document["keyword"].contains("장학금")){
//                        sendPush(document["token"]);
//                    }
//                }
//              // 리사이클러 뷰 갱신
//            }
//            .addOnFailureListener { exception ->
//                // 실패할 경우
//                Log.w("MainActivity", "Error getting documents: $exception")
//            }

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

}
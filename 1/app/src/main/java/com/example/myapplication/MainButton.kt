package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_main_button.*


class MainButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_button)


//        val db = FirebaseFirestore.getInstance();

//        var t_hashMap = HashMap<String, Any>()
//
//        t_hashMap.put("name","조재영")
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




        mainbtn1.setOnClickListener {
            startActivity(Intent(this, Notice::class.java))
        }
        mainbtn2.setOnClickListener {
            startActivity(Intent(this, Lab::class.java))
        }
        mainbtn3.setOnClickListener {
            startActivity(Intent(this, Calendar::class.java))
        }
        mainbtn4.setOnClickListener {
            startActivity(Intent(this, Office::class.java))
        }
    }

}
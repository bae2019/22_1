package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class Notice_Repo {
    fun getData(): LiveData<MutableList<Notice_data>> {
        val mutableData = MutableLiveData<MutableList<Notice_data>>()
        val database = Firebase.database
        val myRef = database.getReference("notice")
        myRef.addValueEventListener(object : ValueEventListener {
            val listData: MutableList<Notice_data> = mutableListOf<Notice_data>()
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()){
                    for (userSnapshot in snapshot.children){
                        val getData = userSnapshot.getValue(Notice_data::class.java)
                        listData.add(getData!!)

                        mutableData.value = listData
                    }
                }
            }
            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })
        return mutableData
    }
}
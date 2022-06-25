package com.example.myapplication.Fragment

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.Lab_data
import com.example.myapplication.Lab_adapter
import com.example.myapplication.R
import kotlinx.android.synthetic.main.frag9.*

class Fragment9 : Fragment() {

    private lateinit var act: Activity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Activity) act = context

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.frag9, container, false)

        return view
    }
    override fun onStart() {
        super.onStart()

        //교수 정보 입력
        val lablist = arrayListOf(
            Lab_data(Pname = "한동석", Lname = "지능신호처리 연구실", Laddress = "IT1-511", Laddress2 = "IT1-509,\n512", Lurl = "https://see.knu.ac.kr/include/profile.html?id=104"),
            Lab_data(Pname = "한병철", Lname = "전력전자 및 제어 시스템 연구실", Laddress = "IT1-925", Laddress2 = " ", Lurl = "https://see.knu.ac.kr/include/profile.html?id=279"),
            Lab_data(Pname = "한준구", Lname = "3차원 광학 기술 연구실", Laddress = "IT2-247", Laddress2 = "IT2-242", Lurl = "https://see.knu.ac.kr/include/profile.html?id=67"),
            Lab_data(Pname = "함성호", Lname = "반도체센서 및 광소자 연구실", Laddress = "IT3-502A", Laddress2 = "IT3-509A", Lurl = "https://see.knu.ac.kr/include/profile.html?id=62"),
            Lab_data(Pname = "허성호", Lname = "Control and Renewable Energy Lab", Laddress = "IT1-805", Laddress2 = "IT1-804", Lurl = "https://see.knu.ac.kr/include/profile.html?id=228")
        )

        rv_lab9.layoutManager = LinearLayoutManager(act, LinearLayoutManager.VERTICAL, false)
        rv_lab9.setHasFixedSize(true)
        rv_lab9.adapter = Lab_adapter(lablist)
    }


}
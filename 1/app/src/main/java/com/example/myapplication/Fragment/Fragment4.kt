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
import kotlinx.android.synthetic.main.frag4.*


class Fragment4 : Fragment() {

    private lateinit var act: Activity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Activity) act = context

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.frag4, container, false)

        return view
    }
    override fun onStart() {
        super.onStart()

        //교수 정보 입력
        val lablist = arrayListOf(
            Lab_data(Pname = "서대화", Lname = "모바일컴퓨팅 및 임베디드시스템 연구실", Laddress = "IT1-305", Laddress2 = "IT1-305,\n306", Lurl = "https://see.knu.ac.kr/include/profile.html?id=96"),
            Lab_data(Pname = "송대건\n(부학부장)", Lname = "지능형 3차원 집적회로 연구실", Laddress = "IT2-241", Laddress2 = " ", Lurl = "https://see.knu.ac.kr/include/profile.html?id=250"),
            Lab_data(Pname = "신미영", Lname = "생체정보 마이닝 연구실", Laddress = "IT3-601B", Laddress2 = "IT3-601A", Lurl = "https://see.knu.ac.kr/include/profile.html?id=79"),
            Lab_data(Pname = "심재훈", Lname = "통신 회로 및 시스템 연구실", Laddress = "IT3-503A", Laddress2 = "IT3-503,\n509", Lurl = "https://see.knu.ac.kr/include/profile.html?id=22")
        )

        rv_lab4.layoutManager = LinearLayoutManager(act, LinearLayoutManager.VERTICAL, false)
        rv_lab4.setHasFixedSize(true)
        rv_lab4.adapter = Lab_adapter(lablist)
    }


}
package com.example.myapplication.Fragment

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.InLab
import com.example.myapplication.InLabAdapter
import com.example.myapplication.R
import kotlinx.android.synthetic.main.frag3.*


class Fragment3 : Fragment() {

    private lateinit var act: Activity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Activity) act = context

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.frag3, container, false)

        return view
    }
    override fun onStart() {
        super.onStart()

        //교수 정보 입력
        val lablist = arrayListOf(
            InLab(Pname = "박길흠", Lname = "영상신호처리 연구실", Laddress = "IT1-703", Laddress2 = "IT1-701,\n702", Lurl = "https://see.knu.ac.kr/include/profile.html?id=78"),
            InLab(Pname = "박대진", Lname = "AI 내장형 소프트웨어 온 칩 연구실", Laddress = "IT1-719", Laddress2 = "IT1-724", Lurl = "https://see.knu.ac.kr/include/profile.html?id=45"),
            InLab(Pname = "박순용\n(전공주임)", Lname = "컴퓨터 및 로봇 비전 연구실", Laddress = "IT1-413", Laddress2 = "IT1-415", Lurl = "https://see.knu.ac.kr/include/profile.html?id=242"),
            InLab(Pname = "박영호", Lname = "통신정보보호 연구실", Laddress = "IT1-705", Laddress2 = "IT1-704,\n706", Lurl = "https://see.knu.ac.kr/include/profile.html?id=90"),
            InLab(Pname = "박정훈", Lname = "Learning and Information Wywtems Lab.", Laddress = "IT1-901", Laddress2 = " ", Lurl = "https://see.knu.ac.kr/include/profile.html?id=249"),
            //InLab(Pname = "박종후", Lname = "나노소자 연구실", Laddress = "E8-306", Laddress2 = "E8-304", Lurl = ""),
            InLab(Pname = "박준구", Lname = "Intelligent Mobility Lab.", Laddress = "IT1-721", Laddress2 = "IT1-723,\n726", Lurl = "https://see.knu.ac.kr/include/profile.html?id=93"),
            InLab(Pname = "박흥식", Lname = "나노 광전자소자 연구실", Laddress = "IT3-305", Laddress2 = "IT3-306", Lurl = "https://see.knu.ac.kr/include/profile.html?id=57"),
            InLab(Pname = "배진혁\n(전공주임)", Lname = "차세대 나노전자소자 연구실", Laddress = "IT3-201", Laddress2 = " ", Lurl = "https://see.knu.ac.kr/include/profile.html?id=58"),
            InLab(Pname = "벨루볼루 칼리아타 차크라바르띠\n(전공주임)", Lname = "Nonlinear Control and Bio-Signal Processing Lab.", Laddress = "IT1-817", Laddress2 = "IT1-815,\n820", Lurl = "https://see.knu.ac.kr/include/profile.html?id=13")
        )

        rv_lab3.layoutManager = LinearLayoutManager(act, LinearLayoutManager.VERTICAL, false)
        rv_lab3.setHasFixedSize(true)
        rv_lab3.adapter = InLabAdapter(lablist)
    }


}
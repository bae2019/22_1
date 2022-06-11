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
import kotlinx.android.synthetic.main.frag7.*

class Fragment7 : Fragment() {

    private lateinit var act: Activity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Activity) act = context

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.frag7, container, false)

        return view
    }
    override fun onStart() {
        super.onStart()

        //교수 정보 입력
        val lablist = arrayListOf(
            InLab(Pname = "최두현", Lname = "지능정보시스템 연구실", Laddress = "IT3-603A", Laddress2 = "IT3-603", Lurl = "https://see.knu.ac.kr/include/profile.html?id=84"),
            InLab(Pname = "최무한\n(학부장)", Lname = "포토닉스 메타소자 연구실", Laddress = "IT1-917", Laddress2 = "IT1-906", Lurl = "https://see.knu.ac.kr/include/profile.html?id=73"),
            InLab(Pname = "최병조", Lname = "스위치모드 전력변환 연구실", Laddress = "IT3-315", Laddress2 = "IT3-314", Lurl = "https://see.knu.ac.kr/include/profile.html?id=38"),
            InLab(Pname = "최봉열", Lname = "신호추정 연구실", Laddress = "IT2-228", Laddress2 = "IT2-228A,\n228B", Lurl = "https://see.knu.ac.kr/include/profile.html?id=85"),
            InLab(Pname = "최상조", Lname = "전자기 소자 및 시스템 연구실", Laddress = "E7-411", Laddress2 = "E7-415", Lurl = "https://see.knu.ac.kr/include/profile.html?id=334"),
            InLab(Pname = "최정식", Lname = "지능형 통신 및 센싱 연구실", Laddress = "E7-305", Laddress2 = " ", Lurl = "https://see.knu.ac.kr/include/profile.html?id=287"),
            InLab(Pname = "최준림", Lname = "지능형 반도체 연구실", Laddress = "IT3-415", Laddress2 = "IT3-414", Lurl = "https://see.knu.ac.kr/include/profile.html?id=42"),
            InLab(Pname = "최평", Lname = "집적회로 연구실", Laddress = "IT1-801", Laddress2 = "IT1-802,\n804", Lurl = "https://see.knu.ac.kr/include/profile.html?id=43"),
            InLab(Pname = "최현철", Lname = "초고주파 연구실", Laddress = "IT1-913", Laddress2 = "IT1-915,\n917", Lurl = "https://see.knu.ac.kr/include/profile.html?id=74")
        )

        rv_lab7.layoutManager = LinearLayoutManager(act, LinearLayoutManager.VERTICAL, false)
        rv_lab7.setHasFixedSize(true)
        rv_lab7.adapter = InLabAdapter(lablist)
    }


}
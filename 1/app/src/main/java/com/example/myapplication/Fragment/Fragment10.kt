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
import kotlinx.android.synthetic.main.frag10.*

class Fragment10 : Fragment() {

    private lateinit var act: Activity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Activity) act = context

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.frag10, container, false)

        return view
    }
    override fun onStart() {
        super.onStart()

        //교수 정보 입력
        val lablist = arrayListOf(
            InLab(Pname = "권혁주", Lname = "BK21계약교수", Laddress = "IT1-310", Laddress2 = " ", Lurl = "https://see.knu.ac.kr/include/profile2.html?id=44"),
            InLab(Pname = "권혜진", Lname = "강의초빙교수", Laddress = "IT1-821", Laddress2 = " ", Lurl = "https://see.knu.ac.kr/include/profile2.html?id=212"),
            InLab(Pname = "김종화", Lname = "강의초빙교수", Laddress = "IT3-307", Laddress2 = " ", Lurl = "https://see.knu.ac.kr/include/profile2.html?id=48"),
            InLab(Pname = "김찬용", Lname = "강의초빙교수", Laddress = "E7-309", Laddress2 = " ", Lurl = "https://see.knu.ac.kr/include/profile2.html?id=203"),
            InLab(Pname = "김호희", Lname = "강의초빙교수", Laddress = "IT3-405", Laddress2 = " ", Lurl = "https://see.knu.ac.kr/include/profile2.html?id=266"),
            InLab(Pname = "말렘 시바 프래탑 래디", Lname = "BK21계약교수", Laddress = "IT3-607", Laddress2 = " ", Lurl = "https://see.knu.ac.kr/include/profile2.html?id=233"),
            InLab(Pname = "박은진", Lname = "강의초빙교수", Laddress = "IT3-307", Laddress2 = " ", Lurl = "https://see.knu.ac.kr/include/profile2.html?id=215"),
            InLab(Pname = "시암 쿠마르 피다파시", Lname = "BK21계약교수", Laddress = "IT3-314", Laddress2 = " ", Lurl = "https://see.knu.ac.kr/include/profile2.html?id=268"),
            InLab(Pname = "윤병주", Lname = "강의초빙교수", Laddress = "IT3-409A", Laddress2 = " ", Lurl = "https://see.knu.ac.kr/include/profile2.html?id=53"),
            InLab(Pname = "이경숙", Lname = "강의초빙교수", Laddress = "IT3-405", Laddress2 = " ", Lurl = "https://see.knu.ac.kr/include/profile2.html?id=54"),
            InLab(Pname = "최영숙", Lname = "강의초빙교수", Laddress = "IT3-405", Laddress2 = " ", Lurl = "https://see.knu.ac.kr/include/profile2.html?id=55")
        )

        rv_lab10.layoutManager = LinearLayoutManager(act, LinearLayoutManager.VERTICAL, false)
        rv_lab10.setHasFixedSize(true)
        rv_lab10.adapter = InLabAdapter(lablist)
    }


}
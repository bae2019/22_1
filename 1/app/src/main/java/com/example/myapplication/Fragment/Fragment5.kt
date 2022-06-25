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
import kotlinx.android.synthetic.main.frag5.*

class Fragment5 : Fragment() {

    private lateinit var act: Activity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Activity) act = context

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.frag5, container, false)

        return view
    }
    override fun onStart() {
        super.onStart()

        //교수 정보 입력
        val lablist = arrayListOf(
            Lab_data(Pname = "안상태", Lname = "뇌인공지능 연구실", Laddress = "IT1-505", Laddress2 = "IT1-504,\n506", Lurl = "https://see.knu.ac.kr/include/profile.html?id=278"),
            Lab_data(Pname = "양정민", Lname = "디지털 제어 연구실", Laddress = "IT1-809", Laddress2 = "IT1-807", Lurl = "https://see.knu.ac.kr/include/profile.html?id=108"),
            Lab_data(Pname = "우지용", Lname = "차세대 반도체 소자 및 시스템 연구실", Laddress = "E7-321", Laddress2 = " ", Lurl = "https://see.knu.ac.kr/include/profile.html?id=280"),
            Lab_data(Pname = "유상대", Lname = "집적시스템 연구실", Laddress = "IT1-607", Laddress2 = "IT1-609,\n611", Lurl = "https://see.knu.ac.kr/include/profile.html?id=25"),
            Lab_data(Pname = "이경운", Lname = "운영체제 연구실", Laddress = "E7-319", Laddress2 = " ", Lurl = "https://see.knu.ac.kr/include/profile.html?id=335"),
            Lab_data(Pname = "이동익", Lname = "고신뢰성 임베디드 제어 시스템 제어연구실", Laddress = "IT1-612", Laddress2 = "IT1-609,\n611", Lurl = "https://see.knu.ac.kr/include/profile.html?id=109"),
            Lab_data(Pname = "이상문", Lname = "사이버물리시스템 제어연구실", Laddress = "IT1-619", Laddress2 = "IT1-620,\n622", Lurl = "https://see.knu.ac.kr/include/profile.html?id=206"),
            Lab_data(Pname = "이석진\n(전공주임)", Lname = "음향공학 및 오디오 연구실 연구실", Laddress = "IT1-519", Laddress2 = "IT1-520", Lurl = "https://see.knu.ac.kr/include/profile.html?id=230"),
            Lab_data(Pname = "이성학", Lname = "비전 및 영상처리 연구실", Laddress = "IT1-307", Laddress2 = "IT1-308,\n310", Lurl = "https://see.knu.ac.kr/include/profile.html?id=46"),
            Lab_data(Pname = "이승열", Lname = "집적 플라즈모닉 광학 소자 연구실", Laddress = "IT1-927", Laddress2 = " ", Lurl = "https://see.knu.ac.kr/include/profile.html?id=217"),
            Lab_data(Pname = "이신형", Lname = "Bio-Inspired Electronics and Integrated System Lab", Laddress = "IT3-304", Laddress2 = "IT3-205,\n304-1", Lurl = "https://see.knu.ac.kr/include/profile.html?id=272"),
            Lab_data(Pname = "이연정", Lname = "지능로봇 연구실", Laddress = "IT1-303", Laddress2 = "IT1-301,\n302", Lurl = "https://see.knu.ac.kr/include/profile.html?id=110"),
            Lab_data(Pname = "이인수", Lname = "지능형시스템 설계 및 응용 연구실", Laddress = "IT1-711", Laddress2 = "IT1-710,\n712", Lurl = "https://see.knu.ac.kr/include/profile.html?id=81"),
            Lab_data(Pname = "이정희", Lname = "Nitride Semiconductor Device Laboratory", Laddress = "IT3-302", Laddress2 = " ", Lurl = "https://see.knu.ac.kr/include/profile.html?id=60"),
            Lab_data(Pname = "이현범", Lname = "자율지능 연구실", Laddress = "IT1-623", Laddress2 = "IT1-621", Lurl = "https://see.knu.ac.kr/include/profile.html?id=240"),
            Lab_data(Pname = "이현열", Lname = "지능형 의료영상기술 연구실", Laddress = "IT1-603", Laddress2 = " ", Lurl = "https://see.knu.ac.kr/include/profile.html?id=284")
        )

        rv_lab5.layoutManager = LinearLayoutManager(act, LinearLayoutManager.VERTICAL, false)
        rv_lab5.setHasFixedSize(true)
        rv_lab5.adapter = Lab_adapter(lablist)
    }


}
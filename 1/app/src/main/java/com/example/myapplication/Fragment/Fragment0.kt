package com.example.myapplication.Fragment

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.*
import kotlinx.android.synthetic.main.frag0.*

class Fragment0 : Fragment() {

    private lateinit var act: Activity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Activity) act = context

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.frag0, container, false)

        return view
    }
    override fun onStart() {
        super.onStart()

        //교수 정보 입력
        val lablist = arrayListOf(
            InLab(Pname = "강순주", Lname = "실시간 시스템 연구실", Laddress = "IT1-503", Laddress2 = "IT1-501\n502"),
            InLab(Pname = "강인만", Lname = "나노 소자 및 시스템 연구실", Laddress = "IT3-202", Laddress2 = "IT3-202"),
            InLab(Pname = "공성호", Lname = "마이크로 및 나노 트랜스듀서 연구실", Laddress = "IT3-213", Laddress2 = "IT3-213A"),
            InLab(Pname = "공준호", Lname = "모바일 SOC & 마이크로프로세서 연구실", Laddress = "IT3-309", Laddress2 = "IT3-309A"),
            InLab(Pname = "김강욱", Lname = "마이크로파 통신 연구실", Laddress = "IT1-923", Laddress2 = "IT1-919,\n921"),
            InLab(Pname = "김대현", Lname = "Future semiconductor divice Lab", Laddress = "IT3-407", Laddress2 = " "),
            InLab(Pname = "김동훈", Lname = "응용전자기 설계최적화 연구실", Laddress = "IT3-404", Laddress2 = " "),
            InLab(Pname = "김민영", Lname = "광기전 및 멀티스케일 로봇 연구실", Laddress = "IT1-517", Laddress2 = " "),
            InLab(Pname = "김수배", Lname = "지능형 전력망 연구실", Laddress = "E8-403", Laddress2 = " "),
            InLab(Pname = "김영모", Lname = "뉴 미디어 연구실", Laddress = "IT1-618", Laddress2 = "IT1-615,\n617"),
            InLab(Pname = "김정준", Lname = "IT 융합 연구실", Laddress = "IT1-527", Laddress2 = " "),
            InLab(Pname = "김지현", Lname = "나노 생체 광디스플레이 연구실", Laddress = "IT1-525", Laddress2 = "IT1-523"),
            InLab(Pname = "김진규", Lname = "고전압 및 플라즈마 응용 연구실", Laddress = "IT3-403", Laddress2 = " "),
            InLab(Pname = "김학린", Lname = "디스플레이/나노-유기전자 소자 연구실", Laddress = "IT3-303", Laddress2 = "IT3-303"),
            InLab(Pname = "김현덕", Lname = "통신시스템 연구실", Laddress = "IT3-602", Laddress2 = "IT3-602A"),
            InLab(Pname = "김형표", Lname = "센서 소자 시스템 연구실", Laddress = "E8-204", Laddress2 = " "),
            InLab(Pname = "김홍준", Lname = "초고주파 회로 연구실", Laddress = "IT3-401", Laddress2 = " ")
        )

        rv_lab0.layoutManager = LinearLayoutManager(act, LinearLayoutManager.VERTICAL, false)
        rv_lab0.setHasFixedSize(true)
        rv_lab0.adapter = InLabAdapter(lablist)
    }


}
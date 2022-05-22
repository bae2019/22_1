package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_lab.*

class Lab : AppCompatActivity() {

    lateinit var navigationView: NavigationView
    lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab)

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
            InLab(Pname = "김홍준", Lname = "초고주파 회로 연구실", Laddress = "IT3-401", Laddress2 = " "),
            /////////////////////////////////////////////////////////
            InLab(Pname = "도윤선", Lname = "나노 포토닉스 응용전자 연구실", Laddress = "IT1-823", Laddress2 = "IT1-824,\n826"),
            /////////////////////////////////////////////////////////
            InLab(Pname = "문병인\n(전공주임)", Lname = "시스템온칩 연구실", Laddress = "IT1-725", Laddress2 = "IT1-727,\n728"),
            InLab(Pname = "민문식\n(전공주임)", Lname = "무선 시스템 연구실", Laddress = "IT1-827", Laddress2 = "IT1-828"),
            /////////////////////////////////////////////////////////
            InLab(Pname = "박길흠", Lname = "영상신호처리 연구실", Laddress = "IT1-703", Laddress2 = "IT1-701,\n702"),
            InLab(Pname = "박대진", Lname = "AI 내장형 소프트웨어 온 칩 연구실", Laddress = "IT1-719", Laddress2 = "IT1-724"),
            InLab(Pname = "박순용\n(전공주임)", Lname = "컴퓨터 및 로봇 비전 연구실", Laddress = "IT1-413", Laddress2 = "IT1-415"),
            InLab(Pname = "박영호", Lname = "통신정보보호 연구실", Laddress = "IT1-705", Laddress2 = "IT1-704,\n706"),
            InLab(Pname = "박정훈", Lname = "Learning and Information Wywtems Lab.", Laddress = "IT1-901", Laddress2 = " "),
            InLab(Pname = "박종후", Lname = "나노소자 연구실", Laddress = "E8-306", Laddress2 = "E8-304"),
            InLab(Pname = "박준구", Lname = "Intelligent Mobility Lab.", Laddress = "IT1-721", Laddress2 = "IT1-723,\n726"),
            InLab(Pname = "박흥식", Lname = "나노 광전자소자 연구실", Laddress = "IT3-305", Laddress2 = "IT3-306"),
            InLab(Pname = "배진혁\n(전공주임)", Lname = "차세대 나노전자소자 연구실", Laddress = "IT3-201", Laddress2 = " "),
            InLab(Pname = "벨루볼루 칼리아타 차크라바르띠\n(전공주임)", Lname = "Nonlinear Control and Bio-Signal Processing Lab.", Laddress = "IT1-817", Laddress2 = "IT1-815,\n820"),
            /////////////////////////////////////////////////////////
            InLab(Pname = "서대화", Lname = "모바일컴퓨팅 및 임베디드시스템 연구실", Laddress = "IT1-305", Laddress2 = "IT1-305,\n306"),
            InLab(Pname = "송대건\n(부학부장)", Lname = "지능형 3차원 집적회로 연구실", Laddress = "IT2-241", Laddress2 = " "),
            InLab(Pname = "신미영", Lname = "생체정보 마이닝 연구실", Laddress = "IT3-601B", Laddress2 = "IT3-601A"),
            InLab(Pname = "심재훈", Lname = "통신 회로 및 시스템 연구실", Laddress = "IT3-503A", Laddress2 = "IT3-503,\n509"),
            /////////////////////////////////////////////////////////
            InLab(Pname = "안상태", Lname = "뇌인공지능 연구실", Laddress = "IT1-505", Laddress2 = "IT1-504,\n506"),
            InLab(Pname = "양정민", Lname = "디지털 제어 연구실", Laddress = "IT1-809", Laddress2 = "IT1-807"),
            InLab(Pname = "우지용", Lname = "차세대 반도체 소자 및 시스템 연구실", Laddress = "E7-321", Laddress2 = " ")
        )

        rv_lab.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_lab.setHasFixedSize(true)
        rv_lab.adapter = InLabAdapter(lablist)
    }
}
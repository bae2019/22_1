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
import kotlinx.android.synthetic.main.frag6.*

class Fragment6 : Fragment() {

    private lateinit var act: Activity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Activity) act = context

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.frag6, container, false)

        return view
    }
    override fun onStart() {
        super.onStart()

        //교수 정보 입력
        val lablist = arrayListOf(
            InLab(Pname = "장길진", Lname = "기계지능연구실", Laddress = "IT1-605", Laddress2 = "IT1-604,\n608"),
            InLab(Pname = "장병철", Lname = "지능형 메모리 컴퓨팅 소자 연구실", Laddress = "IT1-307", Laddress2 = " "),
            InLab(Pname = "장재원", Lname = "차세대 에너지/전자 소자 연구실", Laddress = "IT1-208A", Laddress2 = "IT1-208"),
            InLab(Pname = "전만식", Lname = "광음향 및 광학 연구실", Laddress = "IT1-521", Laddress2 = "IT2-129"),
            InLab(Pname = "정성아", Lname = "Unicon Lab", Laddress = "IT1-717", Laddress2 = "IT1-715,\n720"),
            InLab(Pname = "정연배", Lname = "고집적 전자시스템 연구실", Laddress = "IT3-608", Laddress2 = "IT3-608B"),
            InLab(Pname = "정임영\n(전공주임)", Lname = "IT 융합보안 연구실", Laddress = "IT1-625", Laddress2 = "IT1-626"),
            InLab(Pname = "조건희", Lname = "집적회로 및 시스템", Laddress = "IT1-811", Laddress2 = " "),
            InLab(Pname = "조유제", Lname = "통신망 연구실", Laddress = "IT1-507", Laddress2 = "IT1-508,\n510"),
            InLab(Pname = "조정훈", Lname = "ACE 연구실", Laddress = "IT1-707", Laddress2 = "IT1-708,\n710"),
            InLab(Pname = "조찬섭", Lname = "NEMS/MEMS 연구실", Laddress = "IT3-308", Laddress2 = "IT3-307A,\n307B"),
            InLab(Pname = "조호신", Lname = "이동통신연구실", Laddress = "IT3-502", Laddress2 = "IT3-501"),
            InLab(Pname = "지콴웨이", Lname = "semiconductor energy laboratory", Laddress = "E7-310", Laddress2 = " ")
        )

        rv_lab6.layoutManager = LinearLayoutManager(act, LinearLayoutManager.VERTICAL, false)
        rv_lab6.setHasFixedSize(true)
        rv_lab6.adapter = InLabAdapter(lablist)
    }


}
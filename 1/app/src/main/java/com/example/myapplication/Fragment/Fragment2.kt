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
import kotlinx.android.synthetic.main.frag2.*


class Fragment2 : Fragment() {

    private lateinit var act: Activity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Activity) act = context

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.frag2, container, false)

        return view
    }
    override fun onStart() {
        super.onStart()

        //교수 정보 입력
        val lablist = arrayListOf(
            InLab(Pname = "문병인\n(전공주임)", Lname = "시스템온칩 연구실", Laddress = "IT1-725", Laddress2 = "IT1-727,\n728", Lurl = "https://see.knu.ac.kr/include/profile.html?id=18"),
            InLab(Pname = "민문식\n(전공주임)", Lname = "무선 시스템 연구실", Laddress = "IT1-827", Laddress2 = "IT1-828", Lurl = "https://see.knu.ac.kr/include/profile.html?id=271"),
        )

        rv_lab2.layoutManager = LinearLayoutManager(act, LinearLayoutManager.VERTICAL, false)
        rv_lab2.setHasFixedSize(true)
        rv_lab2.adapter = InLabAdapter(lablist)
    }


}
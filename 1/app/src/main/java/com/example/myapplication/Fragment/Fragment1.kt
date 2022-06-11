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
import kotlinx.android.synthetic.main.frag1.*

class Fragment1 : Fragment() {

    private lateinit var act: Activity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Activity) act = context

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.frag1, container, false)

        return view
    }
    override fun onStart() {
        super.onStart()

        //교수 정보 입력
        val lablist = arrayListOf(
            InLab(Pname = "도윤선", Lname = "나노 포토닉스 응용전자 연구실", Laddress = "IT1-823", Laddress2 = "IT1-824,\n826", Lurl = "https://see.knu.ac.kr/include/profile.html?id=226")
        )

        rv_lab1.layoutManager = LinearLayoutManager(act, LinearLayoutManager.VERTICAL, false)
        rv_lab1.setHasFixedSize(true)
        rv_lab1.adapter = InLabAdapter(lablist)
    }


}
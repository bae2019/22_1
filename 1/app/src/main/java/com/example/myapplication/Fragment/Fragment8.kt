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
import kotlinx.android.synthetic.main.frag8.*

class Fragment8 : Fragment() {

    private lateinit var act: Activity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Activity) act = context

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.frag8, container, false)

        return view
    }
    override fun onStart() {
        super.onStart()

        //교수 정보 입력
        val lablist = arrayListOf(
            Lab_data(Pname = "태흥식", Lname = "Advanced Photon-coupled Plasma Electronics Lab.", Laddress = "IT1-911", Laddress2 = "IT1-907,\n909", Lurl = "https://see.knu.ac.kr/include/profile.html?id=75")
        )

        rv_lab8.layoutManager = LinearLayoutManager(act, LinearLayoutManager.VERTICAL, false)
        rv_lab8.setHasFixedSize(true)
        rv_lab8.adapter = Lab_adapter(lablist)
    }


}
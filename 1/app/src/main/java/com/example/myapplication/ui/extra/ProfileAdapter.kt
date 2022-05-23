package com.example.myapplication.ui.extra

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class ProfileAdapter(val profileList : ArrayList<professor_profile>) : RecyclerView.Adapter<ProfileAdapter.CustomViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int
    ): ProfileAdapter.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.professor_item, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProfileAdapter.CustomViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {

    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val name = itemView.findViewById<TextView>(R.id.professor_name) // 교수님 이름
        val lab_name = itemView.findViewById<TextView>(R.id.lab_name) // 연구실명
        val room_number = itemView.findViewById<TextView>(R.id.room_number) // 랩실호수
    }
}
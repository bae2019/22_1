package com.example.myapplication.ui.extra

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
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
        holder.name.text = profileList.get(position).name
        holder.lab_name.text = profileList.get(position).lab_name
        holder.room_number.text = profileList.get(position).room_number

    }

    override fun getItemCount(): Int {
        return profileList.size
    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val name = itemView.findViewById<TextView>(R.id.professor_name) // 교수님 이름
        val lab_name = itemView.findViewById<TextView>(R.id.lab_name) // 연구실명
        val room_number = itemView.findViewById<TextView>(R.id.room_number) // 랩실호수
    }
}
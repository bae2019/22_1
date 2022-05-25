package com.example.myapplication

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class InLabAdapter (val lablist: ArrayList<InLab>) : RecyclerView.Adapter<InLabAdapter.CustomViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): InLabAdapter.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lab, parent, false)
        return CustomViewHolder(view).apply {
            itemView.setOnClickListener {
                val curPos : Int = adapterPosition
                val labc : InLab = lablist.get(curPos)

                 val intent = Intent(itemView.context, Professor_webview::class.java)
                intent.putExtra("url",labc.Lurl);
                itemView.context.startActivity(intent)
           }
        }
    }

    override fun getItemCount(): Int {
        return lablist.size
    }

    override fun onBindViewHolder(holder: InLabAdapter.CustomViewHolder, position: Int) {
        holder.Pname.text = lablist.get(position).Pname
        holder.Lname.text = lablist.get(position).Lname
        holder.Laddress.text = lablist.get(position).Laddress
        holder.Laddress2.text = lablist.get(position).Laddress2
    }

    class CustomViewHolder(labitemview: View) : RecyclerView.ViewHolder(labitemview) {
        val Pname = itemView.findViewById<TextView>(R.id.item_lab1)
        val Lname = itemView.findViewById<TextView>(R.id.item_lab2)
        val Laddress = itemView.findViewById<TextView>(R.id.item_lab3)
        val Laddress2 = itemView.findViewById<TextView>(R.id.item_lab4)

    }
}


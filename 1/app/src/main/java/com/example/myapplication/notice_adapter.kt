package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Notice.Companion.count
import java.util.*
import kotlin.collections.ArrayList

class notice_adapter(private val context: Context): RecyclerView.Adapter<notice_adapter.ViewHolder>(), Filterable {
    var filteredList = mutableListOf<notice_data>()
    val originalList = mutableListOf<notice_data>()

    fun setListData(data:MutableList<notice_data>){
        filteredList = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): notice_adapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.notice_item,parent, false)
        return ViewHolder(view).apply {
            itemView.setOnClickListener {
                val curP : Int = adapterPosition
                val noticec : notice_data = filteredList.get(curP)

                val intent = Intent(itemView.context, Professor_webview::class.java)
                intent.putExtra("url", noticec.link);
                itemView.context.startActivity(intent)
            }
        }
    }

    override fun onBindViewHolder(holder: notice_adapter.ViewHolder, position: Int) {
        val notice : notice_data = filteredList[position]
        holder.num.text = notice.num
        holder.title.text = notice.title
        holder.writer.text = notice.writer
        holder.date.text = notice.date
        //todo 밑에이거
        //holder.link.text = notice.link
    }

    override fun getItemCount(): Int {
        return filteredList.size
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        /*val num : TextView = itemView.findViewById(R.id.num)
        val title : TextView = itemView.findViewById(R.id.title)
        val writer : TextView = itemView.findViewById(R.id.writer)
        val date : TextView = itemView.findViewById(R.id.date)*/
        val num = itemView.findViewById<TextView>(R.id.num)
        val title = itemView.findViewById<TextView>(R.id.title)
        val writer = itemView.findViewById<TextView>(R.id.writer)
        val date = itemView.findViewById<TextView>(R.id.date)
        //val link = itemView.findViewById<TextView>(R.id.link)

    }

    override fun getFilter(): Filter {
        return object: Filter(){
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val charSearch = constraint.toString()
                if(count == 0) originalList.addAll(filteredList)
                Log.d("필터링함수에서 수신완료", "query: " + charSearch)
                if (charSearch.isEmpty()) {
                    filteredList = originalList
                } else {
                    var tempList = mutableListOf<notice_data>()
                    for (currentNotice in filteredList) {
                        if (currentNotice.title.lowercase(Locale.ROOT).contains(charSearch.lowercase(Locale.ROOT))) {
                            tempList.add(currentNotice)
                            Log.d("filtered and added", "added: " + charSearch)
                            //
                        }
                    }
                    filteredList = tempList
                }
                count++
                val filterResults = FilterResults()
                filterResults.values =  filteredList
                return filterResults

            }

            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                filteredList = results?.values as ArrayList<notice_data>
                notifyDataSetChanged()
            }
       }
    }

}

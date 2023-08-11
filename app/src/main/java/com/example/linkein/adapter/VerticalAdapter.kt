package com.example.linkein.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.linkein.R
import com.example.linkein.model.VerticalModel

class VerticalAdapter(val list:ArrayList<VerticalModel>):RecyclerView.Adapter<VerticalAdapter.VerticalViewHolder>() {

    class VerticalViewHolder(view: View): RecyclerView.ViewHolder(view){

        val tvText=view.findViewById<TextView>(R.id.tv_Text_Item_Ver)
        val tvHistory=view.findViewById<TextView>(R.id.tv_history_item_Ver)
        val tvBudget=view.findViewById<TextView>(R.id.tv_Budget_Item_Ver)
        val tvEntryLevel=view.findViewById<TextView>(R.id.tv_EntryLevel_Item_Ver)
        val tvComment=view.findViewById<TextView>(R.id.tv_Comment_Item_Ver)
        val ivPayStatusImage=view.findViewById<ImageView>(R.id.iv_PaymentImage_Item_Ver)
        val tvPayStatusText=view.findViewById<TextView>(R.id.tv_PaymentText_Item_Ver)
        val tvPayCost=view.findViewById<TextView>(R.id.tv_PaymentCost_Item_Ver)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalViewHolder {

        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_ver_content_main,parent,false)
        return VerticalViewHolder(view)

    }

    override fun getItemCount(): Int {

        return list.size

    }

    override fun onBindViewHolder(holder: VerticalViewHolder, position: Int) {

        val verList=list[position]
        holder.tvText.text=verList.text
        holder.tvHistory.text=verList.history
        holder.tvBudget.text=verList.budget
        holder.tvEntryLevel.text=verList.entryLevel
        holder.tvComment.text=verList.comment
        holder.ivPayStatusImage.setImageResource(verList.payStatus)
        holder.tvPayStatusText.text=verList.payText
        holder.tvPayCost.text=verList.payCost

    }

}
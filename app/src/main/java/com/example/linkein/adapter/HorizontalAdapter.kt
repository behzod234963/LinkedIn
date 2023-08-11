package com.example.linkein.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.linkein.R
import com.example.linkein.model.HorizontalModel

class HorizontalAdapter(val list:ArrayList<HorizontalModel>):RecyclerView.Adapter<HorizontalAdapter.HorizontalViewHolder>() {

    class HorizontalViewHolder(view: View):RecyclerView.ViewHolder(view){

        val tvText=view.findViewById<TextView>(R.id.tv_Text_ItemHoz)
        val tvTextField=view.findViewById<TextView>(R.id.tv_TextField_ItemHoz)
        val ivImage=view.findViewById<ImageView>(R.id.iv_Image_ItemHoz)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_hoz_content_main,parent,false)
        return HorizontalViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: HorizontalViewHolder, position: Int) {

        val hozList=list[position]
        holder.tvText.text=hozList.text
        holder.tvTextField.text=hozList.textField
        holder.ivImage.setImageResource(hozList.image)

    }

}
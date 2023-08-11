package com.example.linkein

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.linkein.adapter.HorizontalAdapter
import com.example.linkein.adapter.VerticalAdapter
import com.example.linkein.model.HorizontalModel
import com.example.linkein.model.VerticalModel

class MainActivity : AppCompatActivity() {
    lateinit var hozList:ArrayList<HorizontalModel>
    lateinit var verList:ArrayList<VerticalModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

    }

    private fun initView() {
        loadVerlist()
        loadHozList()
        val rvVerMain=findViewById<RecyclerView>(R.id.rv_VerContent_Main)
        rvVerMain.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rvVerMain.adapter=VerticalAdapter(verList)
        val rvHozMain=findViewById<RecyclerView>(R.id.rv_HozContent_main)
        rvHozMain.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rvHozMain.adapter=HorizontalAdapter(hozList)


    }

    private fun loadVerlist() {

        verList=ArrayList()
        verList.add(VerticalModel("Android Application publishing(if you have Play console",
            "Fixed-price-Posted 3hr.ago",
            "$14",
            "Entry level",
            "Hello Need Publish android applicationson Google play console account who have a google play console",
            R.drawable.pic_unverified_item_ver,
            "Payment unverfied",
            "$0"))
        verList.add(
            VerticalModel("We need someone who have GP console account",
                "Fixed-price-Posted 7hr.ago",
                "$25",
                "Entry level",
                "Hello Need an Publisher for publishing my android App on Google Play.I have Ready-made",
                R.drawable.pic_verified_item_ver,
                "Payment verfied",
                "$30"))
        verList.add(
            VerticalModel("Need freelancer for host Android application",
                "Fixed-price-Posted 4hr.ago",
                "$35",
                "Entry level",
                "Hello we need who publish application on Google play",
                R.drawable.pic_verified_item_ver,
                "Payment verified",
                "$67"))

    }

    private fun loadHozList() {

        hozList= ArrayList()
        hozList.add(HorizontalModel("Get tips to find work","Learn how to optimize search, use Connects,and more to land yourn first job.",R.drawable.pic_item_hoz))
        hozList.add(HorizontalModel("My proposals","Review your proposals,offers,refferals,and client invitations.",R.drawable.pic_image_item_hoz))

    }
}
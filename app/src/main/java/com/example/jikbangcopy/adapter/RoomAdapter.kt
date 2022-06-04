package com.example.jikbangcopy.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.jikbangcopy.R
import com.example.jikbangcopy.datas.RoomData

class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<RoomData>
    ) :ArrayAdapter<RoomData> (mContext, resId, mList){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if (tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(resId, null)
        }

        val row = tempRow!!
        val data = mList[position]

        row.findViewById<TextView>(R.id.txtPrice).text = data.price.toString()
        row.findViewById<TextView>(R.id.txtAddress).text = data.address
        row.findViewById<TextView>(R.id.txtInformation).text = data.information

        return row
    }
}
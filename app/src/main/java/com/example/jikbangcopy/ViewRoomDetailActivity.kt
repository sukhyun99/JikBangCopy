package com.example.jikbangcopy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jikbangcopy.datas.RoomData
import kotlinx.android.synthetic.main.room_list_item.*

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val roomData = intent.getSerializableExtra("roomInfo") as RoomData


    }
}
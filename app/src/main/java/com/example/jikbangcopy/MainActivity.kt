package com.example.jikbangcopy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jikbangcopy.adapter.RoomAdapter
import com.example.jikbangcopy.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

// 메인화면
class MainActivity : AppCompatActivity() {
    val mRoomList = ArrayList<RoomData>()
    lateinit var mRoomAdapter: RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 방 데이터 추가
        mRoomList.add(RoomData(10000, "서울 성북구", 3, "트리플 역세권"))
        mRoomList.add(RoomData(20000, "서울 서대문구", 8, "신축"))
        mRoomList.add(RoomData(8000, "서울 구로구", -1, "역세권"))
        mRoomList.add(RoomData(175000, "서울 성동구", 2, "월세 가능"))
        mRoomList.add(RoomData(23000, "서울 강동구", 4, "방2개 화장실1개"))
        mRoomList.add(RoomData(47000, "서울 서초구", 13, "한강 뷰"))
        mRoomList.add(RoomData(6000, "서울 양천구", -1, "대출 가능"))
        mRoomList.add(RoomData(280000, "서울 마포구", 4, "방3개"))
        mRoomList.add(RoomData(19000, "서울 관악구", 2, "외국인 가능"))

        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)
        roomListView.adapter = mRoomAdapter

        roomListView.setOnItemClickListener { parent, view, position, id ->
            val myIntent = Intent(this, ViewRoomDetailActivity::class.java)
            myIntent.putExtra("roomInfo", mRoomList[position])

            startActivity(myIntent)
        }
    }
}
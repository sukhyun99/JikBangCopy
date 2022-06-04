package com.example.jikbangcopy.datas

import java.io.Serializable

class RoomData(
    val price: Int,
    val address: String,
    val floor: Int,
    val information: String
) : Serializable {
//    fun getPrice(price: String): String {
//        val txtPrice: String
//
//        if (price.toInt() >= 10000 ) {
//            var arr = price.chunked(1)
//
//            txtPrice = price
//        } else {
//            var arr = price.chunked(1)
//
//            txtPrice = arr[0] + "," + arr[1] +  + arr[2] +  + arr[3]
//        }
//
//        return txtPrice
//    }
}
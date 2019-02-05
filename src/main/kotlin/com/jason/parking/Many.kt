package com.jason.kotlin.parking

import java.time.LocalDateTime

fun main(args: Array<String>) {

    val parkingLot = HashMap<String,Car?>()
    var enter = LocalDateTime.of(2019,2,5,8,0,0)
    var car:Car? = Car("AAA-0001",enter)
    parkingLot.put(car!!.id,car)
    car = Car("BBB-0002",enter.plusMinutes(15)) //15分鐘後又進來一部車
    parkingLot.put(car.id,car)
    var leave = LocalDateTime.of(2019,2,5,9,0,0)
    car = parkingLot.get("AAA-0001")
    car?.leave = leave
    println("${car?.id} duration : ${car?.duration()}")
    parkingLot.remove(car?.id)

    car = parkingLot.get("BBB-0002")
    car?.leave = leave.plusHours(2)
    println("${car?.id} duration : ${car?.duration()}")
    parkingLot.remove(car?.id)











    /*//Mutable的List較耗費記憶體
    // listOf 建出來的List 為 Immutable
    val list = listOf(5,2,7,8,9,10,20,30,40)
    println(list)
    val scores = listOf(66,37,46,55,63)
    for(score in scores){
        println(score)
    }

    //要建立Mutable的List可以用mutableListOf

    var mutableList = mutableListOf(5,2,7,8)
    mutableList.add(9)
    println(mutableList)*/
}
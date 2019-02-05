package com.jason

fun main(args: Array<String>) {  //Mutable的List較耗費記憶體
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
    println(mutableList)
}
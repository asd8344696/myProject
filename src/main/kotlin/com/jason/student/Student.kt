package com.jason.student

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)   //在Kotlin裡 in 是關鍵字 ， 若JAVA屬性有用到Kotlin的關鍵字，在其左右加上`符號即可
    print("Please enter student's name : ")
    var name = scanner.next()
    print("Please enter student's english score: ")
    var english = scanner.nextInt()
    print("Please enter student's math score : ")
    var math = scanner.nextInt()
    val stu = Student(name,english,math)
    stu.print()
}

class Student(var name:String,var english:Int,var math:Int){
    fun print(){
        println(name + "\t" + english + "\t" + math + "\t" +(english+math)/2)
    }
}
package com.jason.kotlin.parking

import java.time.Duration
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val enter = LocalDateTime.of(2019,2,5,8,0,0)

    val leave = LocalDateTime.of(2019,2,5,10,0,0)

    var car = Car("AAA-0810",enter)
    car.leave = leave

    println(car.duration())

    val hours = Math.ceil(car.duration()/60.0).toLong()

    println(hours * 30)

}

class Car(val id : String , val enter : LocalDateTime){
    var leave:LocalDateTime? = null
        set(value) {   // 自訂Setter
            if(enter.isBefore(value))
                field = value   // 此處不可以用this.leave = leave 會再次呼叫Setter 形成無窮迴圈 可以用field表示此Setter的設定對象
        }
    fun duration() : Long = Duration.between(enter,leave).toMinutes()

}
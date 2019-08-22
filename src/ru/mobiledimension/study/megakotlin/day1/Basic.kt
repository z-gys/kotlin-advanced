package ru.mobiledimension.study.megakotlin.day1

import java.util.*

fun main() {
    var a = Random().nextInt()
    when (a) {
        in 1..2 -> println("1-2")
        3, 7, 10 -> println("3, 7, 10")
        else -> println("X3")
    }
    val zz = randomClass()
    when (zz) {
        is String -> println(zz)
        is Int -> println(zz.inv())
    }
}

fun randomClass(): Any = when(Random().nextInt(3)) {
    0-> "String()"
    1 -> 1
    else -> Any()
}
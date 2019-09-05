package ru.mobiledimension.study.megakotlin.day2

import java.lang.StringBuilder
import kotlin.random.Random

fun main() {
    val alphabet = with(StringBuilder()) {
        for (s in 'A'..'Z')
            append(s)
        toString()
    }

    println(alphabet)

    var a = if (Random(1).nextBoolean()) {
        "123"
    } else {
        null
    }

    a?.let {
        println(it)
    }

    var x = 10
    var y = 20

    y = x.also { x = y }

    println("x = ${x}")
    println("y = ${y}")
}
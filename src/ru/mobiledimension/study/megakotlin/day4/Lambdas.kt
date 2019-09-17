package ru.mobiledimension.study.megakotlin.day4

import java.lang.StringBuilder

fun main() {
    val mylamda: (Int) -> Unit = { println(it)}

    mylamda(2)

    myMethod(3, mylamda)

    sum(1) {
        this + 32
    }

    val myString = with(StringBuilder()) {
        append(1)
        append(2)
        toString()
    }

}

fun myMethod(n: Int, lambda: (Int) -> Unit): Unit {
    repeat(n) {lambda(2)}
}

fun sum(receiver: Int, block: Int.()->Int) {
    receiver.block()
}


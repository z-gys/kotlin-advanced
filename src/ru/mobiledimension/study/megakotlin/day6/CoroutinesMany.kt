package ru.mobiledimension.study.megakotlin.day6

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    repeat(100_000) {
        GlobalScope.launch {
            delay(500)
            println("Hi!")
        }
    }
    Thread.sleep(3000)
}
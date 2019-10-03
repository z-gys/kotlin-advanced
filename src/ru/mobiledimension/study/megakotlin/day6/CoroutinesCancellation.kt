package ru.mobiledimension.study.megakotlin.day6

import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val job = launch {
        repeat(1000) {
            delay(1000)
            println("I'm work")
        }
    }
    delay(3000)
    println("I'm tired of waiting")
    job.cancelAndJoin()
}
package ru.mobiledimension.study.megakotlin.day6

import kotlinx.coroutines.*

fun main() = runBlocking {
    val startTime = System.currentTimeMillis()
    var timeForWaiting = startTime
    val job = launch(Dispatchers.Default) {
        var i = 0
        while (i < 5) {
            if (System.currentTimeMillis() >= timeForWaiting) {
                println("I'm work: ${i++}")
                timeForWaiting += 1000
            }
        }
    }
    delay(1500)
    println("I'm tired")
    job.cancel()
}
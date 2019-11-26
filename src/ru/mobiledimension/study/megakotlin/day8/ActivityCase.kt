package ru.mobiledimension.study.megakotlin.day8

import kotlinx.coroutines.*
import kotlinx.coroutines.time.delay

class Activity : CoroutineScope by CoroutineScope(Dispatchers.Default) {
    fun destroy() {
        cancel()
    }

    fun doBussInAssLogick() {
        repeat(10) { i ->
            launch {
                delay((i + 1) * 100L)
                println("Coroutine $i done")
            }
        }
    }
}

fun main() = runBlocking {
    val activity = Activity()
    activity.doBussInAssLogick()
    println("Launched")
    delay(500L)
    println("User turn device!")
    activity.destroy()
    delay(100)
}
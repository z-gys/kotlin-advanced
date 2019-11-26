package ru.mobiledimension.study.megakotlin.day8

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.time.delay

fun main() = runBlocking<Unit> {
    val request = launch {
        repeat(3) { i ->
            launch {
                delay((i + 1) * 100L)
                println("Coroutine $i done")
            }
        }
        println("i'm done")
    }

    request.join()
}
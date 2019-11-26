package ru.mobiledimension.study.megakotlin.day8

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val request = launch {
        GlobalScope.launch {
            println("I'm runnin' in global")
            delay(1000)
            println("Fuck U, i'm workin'")
        }
        launch {
            delay(100)
            println("I'm child")
            delay(1000)
            print("U never see it")
        }

    }
    delay(500)
    request.cancel()
    delay(1000)
    println("Main end")
}
package ru.mobiledimension.study.megakotlin.day6

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {
        delay(100)
        println("from runBlocking")
    }

    coroutineScope {
        launch {
          delay(500)
            println("from inner launch scope")
        }
        delay(200)
        println("from scope")
    }

    println("End of all")
}
package ru.mobiledimension.study.megakotlin.day6

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    val job = GlobalScope.launch {
        doCoroutines()
    }

    println("Hello, ")
    job.join()
}

suspend fun doCoroutines() {
    delay(1000)
    println("Coroutines")
}

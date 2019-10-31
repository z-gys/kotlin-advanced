package ru.mobiledimension.study.megakotlin.day7

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking<Unit> {
    val time = measureTimeMillis {
        val a = doSomething()
        val b = doSomethingElse()
        println(a + b)
    }
    println(time)
}

private suspend fun doSomething():Int {
    delay(1000)
    return 13
}

private suspend fun doSomethingElse():Int {
    delay(1000)
    return 29
}
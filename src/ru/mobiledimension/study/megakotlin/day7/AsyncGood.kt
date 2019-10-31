package ru.mobiledimension.study.megakotlin.day7

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking<Unit> {
    val time = measureTimeMillis {
        val a = async(start = CoroutineStart.LAZY) { doSomething() }
        val b = async(start = CoroutineStart.LAZY) { doSomethingElse() }
        b.start()
        println(a.await() + b.await())
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
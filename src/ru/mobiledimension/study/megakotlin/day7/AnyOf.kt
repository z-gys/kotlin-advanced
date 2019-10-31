package ru.mobiledimension.study.megakotlin.day7

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.selects.select
import kotlin.system.measureTimeMillis

fun main() = runBlocking<Unit> {
    val time = measureTimeMillis {
        val a = async { doSomething() }
        val b = async { doSomethingElse() }
        val result = select<Int> {
            a.onAwait { it }
            b.onAwait { it }
        }
        println(result)
    }

    println(time)
}

private suspend fun doSomething():Int {
    delay(1000)
    return 13
}

private suspend fun doSomethingElse():Int {
    delay(200_000)
    return 29
}
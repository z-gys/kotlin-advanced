package ru.mobiledimension.study.megakotlin.day7

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking<Unit> {
    val time = measureTimeMillis {
        val a = doSomethingAsync()
        val b = doSomethingElse()
        println(a.await() + b.await())
    }
    println(time)
}

private fun doSomethingAsync() = GlobalScope.async {
    delay(1000)
    13
}

private fun doSomethingElse() = GlobalScope.async {
    delay(1000)
    29
}
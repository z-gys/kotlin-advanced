package ru.mobiledimension.study.megakotlin.day7

import kotlinx.coroutines.future.asDeferred
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking<Unit> {
    val time = measureTimeMillis {
        val a = ClosedLegacy.doPart1().asDeferred()
        val b = ClosedLegacy.doPart2().asDeferred()
        println(a.await() * b.await())
    }
    println(time)
}
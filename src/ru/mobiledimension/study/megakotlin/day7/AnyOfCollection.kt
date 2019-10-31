package ru.mobiledimension.study.megakotlin.day7

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.selects.select

fun main() = runBlocking<Unit> {
    val a = async {
        delay(1000)
        1
    }
    val b = async {
        delay(20000)
        2
    }
    val result = listOf<Deferred<Int>>(a, b).anyOf()
    println(result)
}

suspend fun <T> Iterable<Deferred<T>>.anyOf(): T = select {
    forEach {
        it.onAwait {it}
    }
}
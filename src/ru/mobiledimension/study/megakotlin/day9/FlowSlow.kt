package ru.mobiledimension.study.megakotlin.day9

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

private fun myFlow(): Flow<Int> = flow{
    repeat(5) {
        delay(100)
        emit(it)
    }
}

fun main() = runBlocking {
    val timeMillis = measureTimeMillis {
        myFlow().buffer(6).collect {
            delay(300)
            println(it)
        }
    }
    println(timeMillis)
}
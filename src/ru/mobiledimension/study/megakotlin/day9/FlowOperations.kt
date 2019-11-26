package ru.mobiledimension.study.megakotlin.day9

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

private fun myFlow(): Flow<Int> = flow {
    repeat(5) {
        delay(100)
        emit(it)
    }
}

fun main() = runBlocking<Unit> {
    val flow = myFlow()

    flow
        //.filter { it.rem(2) == 0 }
        //.map { "received $it" }
        .transform {
            emit("Hi")
            emit(it.toString())
        }
        .collect { println(it)}
}
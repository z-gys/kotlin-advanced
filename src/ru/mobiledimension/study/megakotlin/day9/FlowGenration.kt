package ru.mobiledimension.study.megakotlin.day9

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

private fun myFlow(): Flow<Int> = flow {
    println("Run flow")
    repeat(5) {
        delay(100)
        emit(it)
    }
}

fun main() = runBlocking<Unit> {
    launch {
        repeat(5) {
            delay(100);
            println("I'm not blocked")
        }
    }
    myFlow().collect { println(it)}
    myFlow().collect { println(it)}
}
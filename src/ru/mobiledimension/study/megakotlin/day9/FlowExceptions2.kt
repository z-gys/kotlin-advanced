package ru.mobiledimension.study.megakotlin.day9

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

private fun myFlow(): Flow<Int> = flow{
    repeat(5) {
        delay(100)
        check(it <= 2)
        emit(it)
    }
}

fun main() = runBlocking<Unit> {
    try {
        myFlow()
            .onEach { println(it) }
            .launchIn(CoroutineScope(Dispatchers.IO))
    } catch (e: Exception) {
        println(e.toString())
    }

}
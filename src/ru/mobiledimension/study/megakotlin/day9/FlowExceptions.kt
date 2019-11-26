package ru.mobiledimension.study.megakotlin.day9

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

private fun myFlow(): Flow<Int> = flow {
    repeat(5) {
        delay(100)
        check(it <= 2)
        emit(it)
    }
}

fun main() = runBlocking {
    myFlow()
        .onCompletion { cause -> if (cause != null) println("Caught $cause")}
        .catch {}
        .collect {
        println(it)
    }

}
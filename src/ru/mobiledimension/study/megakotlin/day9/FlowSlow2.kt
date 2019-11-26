package ru.mobiledimension.study.megakotlin.day9

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

private fun myFlow(): Flow<Int> = flow {
    repeat(5) {
        delay(100)
        emit(it)
    }
}

fun main() = runBlocking<Unit> {
    withTimeoutOrNull(300) {
        myFlow()
            .collect {
                println(it)
            }
    }
}
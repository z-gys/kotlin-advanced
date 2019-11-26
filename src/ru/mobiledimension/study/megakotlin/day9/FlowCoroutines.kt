package ru.mobiledimension.study.megakotlin.day9

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import ru.mobiledimension.study.megakotlin.day7.log

private fun myFlow(): Flow<Int> = flow {
    repeat(5) {
        log("produced $it")
        delay(100)
        emit(it)
    }
}.flowOn(Dispatchers.Default)

fun main() = runBlocking<Unit>{
    myFlow()
        .onEach { log(it.toString()) }
        .launchIn(this)
    println("Done")
}
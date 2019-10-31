package ru.mobiledimension.study.megakotlin.day7

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    launch {
        println("main runBlocking           ${Thread.currentThread().name} ")
        delay(100)
        println("main runBlocking           ${Thread.currentThread().name} ")
    }
    launch(Dispatchers.Unconfined) {
        println("Unconfined                   ${Thread.currentThread().name} ")
        delay(100)
        println("Unconfined                   ${Thread.currentThread().name} ")
    }
}

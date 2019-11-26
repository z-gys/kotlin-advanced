package ru.mobiledimension.study.megakotlin.day8

import kotlinx.coroutines.*
import java.lang.RuntimeException


fun main() = runBlocking<Unit> {
    val handler = CoroutineExceptionHandler { _, e -> println("Catched exception $e") }
    val deferred = GlobalScope.async(handler) {
        throw RuntimeException()
    }
    val job = GlobalScope.launch(handler) {
        throw NullPointerException()
    }

    println("JOin to failed job")
    job.join()
    println("Await")
    try {
        deferred.await()
    } catch (e: Exception) {
        println("Catched $e")
    }
}
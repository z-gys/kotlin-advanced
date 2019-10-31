package ru.mobiledimension.study.megakotlin.day7

import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

fun log(msg: String) = println("${Thread.currentThread().name}: $msg")

fun main() = runBlocking<Unit> {
    val a = async {
        log("as1")
        6
    }
    val b = async {
        log("as2")
        7
    }
    log("${a.await()*b.await()}")
}
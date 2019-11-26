package ru.mobiledimension.study.megakotlin.day8

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import ru.mobiledimension.study.megakotlin.day7.log

fun main() {
    newSingleThreadContext("ctx1").use { ctx1 ->
        newSingleThreadContext("ctx2").use { ctx2 ->
            runBlocking(ctx1 + CoroutineName("Vasya")) {
                log("start in ctx1")
                withContext(ctx2) {
                    log("switch to ctx2")
                }
                log("return to ctx1")
            }
        }
    }
}
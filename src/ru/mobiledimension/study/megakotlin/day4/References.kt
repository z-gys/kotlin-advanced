package ru.mobiledimension.study.megakotlin.day4

fun main() {
    listOf(1, 3, 5)
        .map(::intMapper)
}

fun intMapper(i: Int): String {
    return i.toString()
}
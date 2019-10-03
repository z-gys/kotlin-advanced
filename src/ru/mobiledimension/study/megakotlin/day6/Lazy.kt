package ru.mobiledimension.study.megakotlin.day6

val lazyField : String by lazy(LazyThreadSafetyMode.NONE) {
    println("Calculation")
    "lazyField"
}

fun main() {
    println(lazyField)
    println(lazyField)
}
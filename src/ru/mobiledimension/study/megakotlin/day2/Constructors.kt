package ru.mobiledimension.study.megakotlin.day2

open class Parent(val a: Int) {
    constructor() : this(1) {

    }
}

class Child(a: Int, val b: Int, c: Int): Parent(){
    val calculated: Int

    init {
        calculated = c + a + b
    }
}

fun main() {
    Child(c = 1, b = 2, a = 3)
}
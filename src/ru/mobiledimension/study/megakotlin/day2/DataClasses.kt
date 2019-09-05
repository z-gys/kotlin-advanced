package ru.mobiledimension.study.megakotlin.day2

open class BaseClass()

data class MyDataClass(val a: List<String>, var b: Int) : BaseClass()

fun main() {
    val myDataClass = MyDataClass(mutableListOf("1"), 1)
    val copy = myDataClass.copy(b = 2)
    println("copy = ${copy.a} ${copy.b}")
}

package ru.mobiledimension.study.megakotlin.day3

fun main() {
    val multiplied: String = "abc" * 2
    println(multiplied)
}

data class Vector(val x: Int, val y: Int) {
    operator fun plus(other: Vector): Vector {
        val newX = x + other.x
        val newY = y + other.y
        return Vector(newX, newY)
    }
}

operator fun String.times(i: Int): String{
  return with(StringBuilder()) {
      repeat(i) {append(this@times)}
      toString()
  }
}
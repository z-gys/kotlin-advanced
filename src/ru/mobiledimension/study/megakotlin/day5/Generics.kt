

package ru.mobiledimension.study.megakotlin.day5

import kotlin.random.Random

interface Source<out T> {
    fun produce(): T
}

class RandomIntProducer: Source<Int> {
    override fun produce(): Int {
        return Random(1).nextInt()
    }
}

fun prodDemo(intProducer: Source<Int>) {
    val producer: Source<*> = intProducer
    producer.produce()
}

interface Comparable<in T> {
    fun compare(other: T): Int
}

fun consDemo(x: Comparable<Number>) {
    x.compare(1.0)
    val y: Comparable<Double> = x
}

fun legacyDemo(): List<String> {
    @Suppress("UNCHECKED_CAST")
    val stringList:MutableList<String> = FuckinLegacy.getStringList() as MutableList<String>
    return stringList.sorted()
}
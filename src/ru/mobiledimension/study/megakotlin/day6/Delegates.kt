package ru.mobiledimension.study.megakotlin.day6

interface Base {
    fun printMsg(msg: String)
    fun printLnMsg(msg: String)
}

class BaseImpl: Base {
    override fun printMsg(msg: String) {
        print(msg)
    }

    override fun printLnMsg(msg: String) {
        println(msg)
    }
}

class Delegate(b: Base): Base by b  {
    override fun printMsg(msg: String) {
        println("delegate: $msg")
    }
}

fun main() {
    val baseImpl = BaseImpl()
    val delegate = Delegate(baseImpl)
    delegate.printMsg("aaa")
}
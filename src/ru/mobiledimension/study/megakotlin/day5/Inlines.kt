package ru.mobiledimension.study.megakotlin.day5

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock
import javax.swing.tree.TreeNode

fun main() {
    val lock = ReentrantLock()
    lock(lock) {
        42
    }
}

inline fun <T> lock(lock: Lock, body: ()->T ):T {
    lock.lock()
    try {
        return body()
    } finally {
        lock.unlock()
    }
}

inline fun cross(crossinline body:() -> Unit) {
    val f= Runnable { body() }
    Thread(f).start()
}

inline fun notInlined(inlined: ()->Unit, noinline notInlined: ()->Unit): ()->Unit {
    return notInlined
}

inline fun<reified T> TreeNode.findParentOfType(clazz: Class<T>): T? {
    var p = parent
    while (p != null && !clazz.isInstance(p)){
        p = p.parent
    }
    return p as T
}



fun doSomething() {


}

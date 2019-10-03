package ru.mobiledimension.study.megakotlin.day4

enum class RequestType {
    GET,
    POST;

    infix fun to(url: String) : () -> String {
        val reqType = this.toString()
        val lambda = {"Make $reqType request to $url"}
        return lambda
    }
}

fun make(callable: () -> String)  {
    println(callable())
}

fun main() {
    make(RequestType.GET to "mobdim.ru")

    //"http://mobdim.ru".get()
}


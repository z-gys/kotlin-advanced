package ru.mobiledimension.study.megakotlin.day3

data class Response(val data: Any, val meta: List<Message>) {
    operator fun plus(other: Response): Response {
        return Response(data, meta + other.meta)
    }
}

data class Message(val level: String, val messageText: String)
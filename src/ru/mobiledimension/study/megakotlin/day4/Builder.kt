package ru.mobiledimension.study.megakotlin.day4

class Html {
    fun body() {}
}

fun html(init : Html.() -> Html): Html {
    val html = Html()
    html.init()
    return html
}

fun main() {
    html {
        body()
        this
    }
}
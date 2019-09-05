package ru.mobiledimension.study.megakotlin.day3

fun main() {
    Entity(1, "z", "asdasd").toDto()

}

data class Entity(val id: Int, val name: String, val password: String)

data class Dto(val id: Int, val name: String)

fun Entity.toDto(): Dto = Dto(id, name)


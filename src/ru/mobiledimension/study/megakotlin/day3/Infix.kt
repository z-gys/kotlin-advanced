package ru.mobiledimension.study.megakotlin.day3

fun main() {
    1.shl(2)

    (1 shl 2) shr 2

    PasswordHolder("my password") xor 'z'
}

data class PasswordHolder(val password: String) {
    infix fun xor (c: Char): PasswordHolder {
        return PasswordHolder(this.password.chars().map {it.xor(c.toInt())}.toString())
    }
}


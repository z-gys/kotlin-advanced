package ru.mobiledimension.study.megakotlin.day2

import java.time.LocalDateTime

class Measurement(
    var id: Long? = null,
    var active: Boolean = false,
    val createdOn: LocalDateTime = LocalDateTime.MIN,
    val updatedOn: LocalDateTime = LocalDateTime.MIN,
    val uid: String = "",
    val data: ByteArray = ByteArray(0)
) {
    constructor(
        active: Boolean,
        createdOn: LocalDateTime,
        updatedOn: LocalDateTime,
        uid: String,
        data: ByteArray
    ) : this(null, active, createdOn, updatedOn, uid, data)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Measurement

        if (active != other.active) return false
        if (createdOn != other.createdOn) return false
        if (updatedOn != other.updatedOn) return false
        if (uid != other.uid) return false

        return true
    }

    override fun hashCode(): Int {
        var result = active.hashCode()
        result = 31 * result + createdOn.hashCode()
        result = 31 * result + updatedOn.hashCode()
        result = 31 * result + uid.hashCode()
        return result
    }


}

fun main() {
}
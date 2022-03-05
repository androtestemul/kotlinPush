package data.push_types.interfaces

import data.PushSystem

interface PushType {
    val pushSystem: PushSystem

    fun filter() : Boolean
}








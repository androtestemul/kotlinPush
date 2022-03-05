package data.push_types.interfaces

import data.Gender

interface GenderPushType : PushType {
    val gender: Gender

    fun filterByGenre() = gender == pushSystem.gender
}
package data.push_types

import data.Gender
import data.PushSystem
import data.push_types.interfaces.AgePushType
import data.push_types.interfaces.GenderPushType
import data.push_types.interfaces.PushType

class GenderAgePush(
    override val pushSystem: PushSystem,
    override val age: Int,
    override val gender: Gender
) :  AgePushType, GenderPushType {

    override fun filter(): Boolean = filterByAge() && filterByGenre()

}
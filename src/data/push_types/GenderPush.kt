package data.push_types

import data.Gender
import data.PushSystem
import data.push_types.interfaces.GenderPushType

class GenderPush(
    override val pushSystem: PushSystem,
    override val gender: Gender
) : GenderPushType {
    override fun filter() = filterByGenre()
}
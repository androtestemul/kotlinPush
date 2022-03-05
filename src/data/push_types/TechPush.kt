package data.push_types

import data.PushSystem
import data.push_types.interfaces.TechPushType

class TechPush(
    override val pushSystem: PushSystem,
    override val osVersion: Int
) : TechPushType {
    override fun filter() = filterByOsVersion()
}
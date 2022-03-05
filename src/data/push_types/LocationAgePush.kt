package data.push_types

import data.LocationPoint
import data.PushSystem
import data.push_types.interfaces.AgePushType
import data.push_types.interfaces.LocationPushType

class LocationAgePush(
    override val pushSystem: PushSystem,
    override val age: Int,
    override val locationPoint: LocationPoint,
    override val radius: Int
) : LocationPushType, AgePushType {
    override fun filter() = filterByAge() && filterByLocation()
}
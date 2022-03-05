package data.push_types

import data.LocationPoint
import data.PushSystem
import data.push_types.interfaces.ExpiryPushType
import data.push_types.interfaces.LocationPushType

class LocationPush(
    override val pushSystem: PushSystem,
    override val expiryDate: Long,
    override val locationPoint: LocationPoint,
    override val radius: Int
) : ExpiryPushType, LocationPushType {
    override fun filter() = filterByExpiry() && filterByLocation()
}
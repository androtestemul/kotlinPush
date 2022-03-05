package data.push_types.interfaces

import data.LocationPoint
import kotlin.math.pow
import kotlin.math.sqrt

interface LocationPushType : PushType {
    val locationPoint: LocationPoint
    val radius: Int

    fun filterByLocation(): Boolean {
        val dist = sqrt(
            (pushSystem.locationPoint.x - locationPoint.x).pow(2) + (pushSystem.locationPoint.y - locationPoint.y).pow(2)
        )

        return dist <= radius
    }
}
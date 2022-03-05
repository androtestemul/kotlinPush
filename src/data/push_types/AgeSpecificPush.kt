package data.push_types

import data.PushSystem
import data.push_types.interfaces.AgePushType
import data.push_types.interfaces.ExpiryPushType

class AgeSpecificPush(
    override val pushSystem: PushSystem,
    override val age: Int,
    override val expiryDate: Long
) : AgePushType, ExpiryPushType {

    override fun filter(): Boolean = filterByAge() && filterByExpiry()

}
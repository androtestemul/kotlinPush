package data

import data.push_types.*
import data.push_types.interfaces.PushType


object PushFactory {

    fun createPushType(pushSystem: PushSystem, params: PushTypeParams): PushType {
        return when (PushTypes.fromString(params.type)) {
            PushTypes.AGE_SPECIFIC -> AgeSpecificPush(pushSystem, params.age, params.expiryDate)
            PushTypes.GENDER_AGE -> GenderAgePush(pushSystem, params.age, params.gender)
            PushTypes.GENDER -> GenderPush(pushSystem, params.gender)
            PushTypes.LOCATION_AGE -> LocationAgePush(pushSystem, params.age, params.locationPoint, params.radius)
            PushTypes.LOCATION -> LocationPush(pushSystem, params.expiryDate, params.locationPoint, params.radius)
            PushTypes.TECH -> TechPush(pushSystem, params.osVersion)
            else -> {
                throw Throwable("Не найден тип пуша ${params.type}")
            }
        }
    }

}
package data.push_types.interfaces

interface TechPushType : PushType {
    val osVersion: Int

    fun filterByOsVersion() = pushSystem.osVersion <= osVersion
}
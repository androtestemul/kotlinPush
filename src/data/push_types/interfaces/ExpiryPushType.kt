package data.push_types.interfaces

interface ExpiryPushType : PushType {
    val expiryDate: Long

    fun filterByExpiry() = expiryDate >= pushSystem.time

}
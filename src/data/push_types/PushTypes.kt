package data.push_types

enum class PushTypes(val value: String) {
    AGE_SPECIFIC("AgeSpecificPush"),
    GENDER_AGE("GenderAgePush"),
    GENDER("GenderPush"),
    LOCATION_AGE("LocationAgePush"),
    LOCATION("LocationPush"),
    TECH("TechPush");

    companion object {
        fun fromString(text: String?): PushTypes? {
            for (b in values()) {
                if (b.value.equals(text, ignoreCase = true)) {
                    return b
                }
            }
            return null
        }
    }
}
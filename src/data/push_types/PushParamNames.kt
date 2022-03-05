package data.push_types

enum class PushParamNames(val value: String) {
    AGE("age"),
    EXPIRY_DATE("expiry_date"),
    GENDER("gender"),
    OS_VERSION("os_version"),
    RADIUS("radius"),
    TEXT("text"),
    TYPE("type"),
    X_COORD("x_coord"),
    Y_COORD("y_coord");

    companion object {
        fun fromString(text: String?): PushParamNames? {
            for (b in values()) {
                if (b.value.equals(text, ignoreCase = true)) {
                    return b
                }
            }
            return null
        }
    }
}
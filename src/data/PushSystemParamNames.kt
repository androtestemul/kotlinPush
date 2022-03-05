package data

enum class PushSystemParamNames(val value: String) {
    AGE("age"),
    GENDER("gender"),
    OS_VERSION("os_version"),
    TIME("time"),
    X_COORD("x_coord"),
    Y_COORD("y_coord");

    companion object {
        fun fromString(text: String?): PushSystemParamNames? {
            for (b in values()) {
                if (b.value.equals(text, ignoreCase = true)) {
                    return b
                }
            }
            return null
        }
    }
}
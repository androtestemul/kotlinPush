package data

class PushSystem(params: PushSystemParams) {
    val time = params.time
    val age = params.age
    val osVersion = params.osVersion
    val locationPoint = params.locationPoint
    val gender = params.gender

    private val pushList: ArrayList<Push> = arrayListOf()

    fun addPush(push: Push) {
        pushList.add(push)
    }

    fun printFilteredPushes() {
        val filteredPushList = pushList.filter { it.type.filter() }

        if (filteredPushList.isEmpty()) {
            println("-1")
        } else {
            filteredPushList.forEach {
                println(it.text)
            }
        }
    }
}
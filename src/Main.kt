import data.*
import data.push_types.PushParamNames
import data.push_types.PushParamNames.Companion.fromString
import data.push_types.PushTypeParams

fun main() {
    println("Введите 6 параметров системы")

    var params: List<String>

    val systemLocationPoint = LocationPoint()
    val systemParams = PushSystemParams()

    for (i in 1..6) {
        params = readLine().toString().split(" ")

        fillSystemParams(systemParams, systemLocationPoint, params)
    }

    systemParams.locationPoint = systemLocationPoint

    val pushSystem = PushSystem(systemParams)

    println("Введите количество пушей")

    val pushCount: String = readLine().toString()

    val pushTypeParams = PushTypeParams()

    for (n in 1..pushCount.toInt()) {
        println("Введите количество параметров пуша №$n")

        val pushParamsCount: String = readLine().toString()

        println("Введите $pushParamsCount параметров пуша №$n")

        val pushLocationPoint = LocationPoint()

        for (m in 1..pushParamsCount.toInt()) {
            params = readLine().toString().split(" ")

            fillPushTypeParams(pushTypeParams, pushLocationPoint, params)
        }

        pushTypeParams.locationPoint = pushLocationPoint

        val pushType = PushFactory.createPushType(pushSystem, pushTypeParams)

        pushSystem.addPush(
            Push(pushTypeParams.text, pushType)
        )
    }

    pushSystem.printFilteredPushes()
}

fun fillSystemParams(systemParams: PushSystemParams, systemLocationPoint: LocationPoint, params: List<String>) {
    when (PushSystemParamNames.fromString(params[0])) {
        PushSystemParamNames.TIME -> systemParams.time = params[1].toLong()
        PushSystemParamNames.AGE -> systemParams.age = params[1].toInt()
        PushSystemParamNames.OS_VERSION -> systemParams.osVersion = params[1].toInt()
        PushSystemParamNames.X_COORD -> systemLocationPoint.x = params[1].toFloat()
        PushSystemParamNames.Y_COORD -> systemLocationPoint.y = params[1].toFloat()
        PushSystemParamNames.GENDER -> systemParams.gender = if (params[1] == Gender.M.value) Gender.M else Gender.F
        else -> {}
    }
}

fun fillPushTypeParams(pushTypeParams: PushTypeParams, pushLocationPoint: LocationPoint, params: List<String>) {
    when (fromString(params[0])) {
        PushParamNames.AGE -> pushTypeParams.age = params[1].toInt()
        PushParamNames.EXPIRY_DATE -> pushTypeParams.expiryDate = params[1].toLong()
        PushParamNames.OS_VERSION -> pushTypeParams.osVersion = params[1].toInt()
        PushParamNames.RADIUS -> pushTypeParams.radius = params[1].toInt()
        PushParamNames.TEXT -> pushTypeParams.text = params[1]
        PushParamNames.TYPE -> pushTypeParams.type = params[1]
        PushParamNames.X_COORD -> pushLocationPoint.x = params[1].toFloat()
        PushParamNames.Y_COORD -> pushLocationPoint.y = params[1].toFloat()
        PushParamNames.GENDER -> pushTypeParams.gender = if (params[1] == Gender.M.value) Gender.M else Gender.F
        else -> {}
    }
}
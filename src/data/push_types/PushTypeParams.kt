package data.push_types

import data.Gender
import data.LocationPoint

class PushTypeParams {
    var age = 0
    var expiryDate = 0L
    var osVersion = 0
    var radius = 0
    var text = ""
    var type = ""
    lateinit var locationPoint: LocationPoint
    lateinit var gender: Gender
}
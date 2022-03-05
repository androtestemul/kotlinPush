package data.push_types.interfaces

interface AgePushType : PushType {

    val age: Int

    fun filterByAge() = age <= pushSystem.age

}
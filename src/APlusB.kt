fun main() {

    println("Введите количество наборов входных данных")

    val dataCount: String = readLine().toString()

    val resultArray = mutableListOf<Int>()
    var numberList : List<String>

    for (i in 1..dataCount.toInt()) {
        numberList = readLine().toString().split(" ")

        resultArray.add(numberList[0].toInt() + numberList[1].toInt())
    }

    resultArray.forEach {
        println(it)
    }

}
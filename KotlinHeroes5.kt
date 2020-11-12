




fun gamburger(inputList: MutableList<Pair<Long?, String?>>) : List<Long> {
    val resultList = mutableListOf<Long>()
    for ((count, money) in inputList) {
        val moneyOfPerson = money!!.split(" ")
        val listOfPrib = mutableListOf<Long>()
        for (i in moneyOfPerson.indices) {
            val gamburgerPrice = moneyOfPerson[i].toLong()
            val filteredMoneyOfPersonList = moneyOfPerson.filter { it.toLong() >= gamburgerPrice }
            listOfPrib.add(gamburgerPrice * filteredMoneyOfPersonList.size)
        }
        listOfPrib.maxOrNull()?.let { resultList.add(it) }
    }
    return resultList
}

fun main() {
    val tmpList = mutableListOf<Pair<Long?, String?>>()
    println("Введите кол-во наборов данных: ")
    val count = readLine()?.toLong()
    for (i in 0 until count!!) {
        println("Введите набор № $i")
        val countOfPeople = readLine()?.toLong()
        val moneyForPeople = readLine()
        tmpList.add(Pair(countOfPeople, moneyForPeople))
    }
    for (element in gamburger(tmpList)) {
        println(element)
    }
}
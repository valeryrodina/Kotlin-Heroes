fun revolution(n: Int, k: Int): List<Int> {
    val result = mutableListOf<Int>()
    var tmpResult = n / (1 + k * (1 + k * (1 + k)))
    for (i in 0 until 4) {
        result.add(tmpResult)
        tmpResult *= k
    }
    return result
}

fun main() {
    val count = readLine()?.toInt()
    val params = mutableListOf<Pair<Int, Int>>()
    for (i in 0 until count!!) {
        val nextLine = readLine()
        if (nextLine != null) {
            val parts = nextLine.split(" ")
            val n = parts[0].toInt()
            val k = parts[1].toInt()
            params.add(Pair(n, k))
        }
    }
    for ((first, second) in params) {
        println(revolution(first, second).joinToString(separator = " "))
    }
}

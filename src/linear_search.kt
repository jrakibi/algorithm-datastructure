fun linearSearch(list: List<Int>, target: Int): Int? {
    for(i in list.indices) {
        if (list[i] == target) {
            return i
        }
    }
    return null
}


fun main() {
    val list: List<Int> = listOf(1, 2, 3, 5, 6, 7, 8, 9, 10)
    val result = linearSearch(list, 6)
    verify(result)
}
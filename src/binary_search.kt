import kotlin.math.floor

fun binarySearch(list: List<Int>, target: Int): Int? {
    var first = 0
    var last = list.size - 1
    while (first <= last) {
        var midpoint = floor(((first + last)/2).toDouble()).toInt()
        if (list[midpoint] == target) return midpoint
        else if (list[midpoint] < target) {
            first = midpoint + 1
        }
        else if (list[midpoint] > target) {
            last = midpoint - 1
        }
    }

    return null
}

fun main() {
    val list: List<Int> = listOf(1, 2, 3, 5, 6, 7, 8, 9, 10)
    val result = binarySearch(list, 10)
    verify(result)
}
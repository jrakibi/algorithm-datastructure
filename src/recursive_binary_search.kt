import kotlin.math.floor

fun recursiveBinarySearch(list: List<Int>, target: Int): Boolean {
    if(list.isEmpty()) return false
    else {
        var midpoint = floor((list.size /2).toDouble()).toInt()
        if (list[midpoint] == target) return true
        else
            if (list[midpoint] < target ) {
                return recursiveBinarySearch(list.subList(midpoint+1, list.size-1), target)
            }
            else {
                return recursiveBinarySearch(list.subList(midpoint-1, list.size-1), target)
            }
    }
}


fun main() {
    val list: List<Int> = listOf(1, 2, 3, 5, 6, 7, 8, 9, 10)
    val result = recursiveBinarySearch(list, 11 )
    println("Target result : $result")
}
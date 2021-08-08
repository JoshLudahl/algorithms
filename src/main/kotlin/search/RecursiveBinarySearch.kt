package search

class RecursiveBinarySearch {

    fun recursiveBinarySearch(list: List<Int>, target: Int): Boolean {

        if (list.isEmpty()) return false
        if (list.size == 1) return list[0] == target

        val middle = list.size / 2
        println("List size is: $middle")

        if (list[middle] == target) return true

        if (list[middle] > target) recursiveBinarySearch(list, target)
        //  Handle this.
        return false
    }
}

fun main() {

}
class SelectionSort {

    //  Find the index of the smallest value
    fun findSmallestIndex(list: List<Int>): Int {
        var smallest = list[0]
        var smallestIndex = 0

        for (index in 0 until list.size) {
            if (list[index] < smallest) {
                smallest = list[index]
                smallestIndex = index
            }
        }
        return smallestIndex
    }

    //  Sort the array of integers
    fun sortArray(list: MutableList<Int>): List<Int> {
        var newArray = mutableListOf<Int>()

        for (index in 0 until list.size) {
            var newSmallest = findSmallestIndex(list)
            newArray.add(list[newSmallest])
            list.removeAt(newSmallest)
        }
        return newArray
    }
}

fun main() {
    var list = mutableListOf<Int>(1, 2, 3, 6, 8, 10, 2, 9, 1, 7, 1, 12, 145, 3)
    println("Pre Sorted: $list")
    var selectionSort = SelectionSort()
    var sortedList = selectionSort.sortArray(list)

    println("Post Sorted: $sortedList")

}
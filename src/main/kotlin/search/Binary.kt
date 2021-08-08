package search
class BinarySearch(private var element: Int) {

    fun intSearch(list: List<Int>): Boolean {
        var low = 0
        var high = list.size-1
        while (low <= high) {
            val mid = (low + high) / 2
            val guess = list[mid]
            if (guess == element) {
                println("$element is in the list!!!!")
                return true
            } else if (guess > element) {
                high = mid - 1
            } else {
                low = mid + 1
            }
        }
        println("$element is not in the list!")
        return false
    }
}
//  Execute Search ( this assumes list is sorted )
fun main() {
    val list = mutableListOf<Int>()

    for (i in 1..1000) {
        list.add(i)
    }

    val search = BinarySearch(699)
    search.intSearch(list.sorted())
}
package problems.leetcode

class UniqueOccurrences {

    fun uniqueOccurrences(arr: IntArray): Boolean {

        // If array is empty, return false
        if (arr.isEmpty()) return false

        // Create a mutable map to store pairs
        val valueMap = HashMap<Int, Int>()

        // Loop through the elements in the array
        for (value in arr) {

            // Add each item to the array, or update the value by one if the key exists
            valueMap.put(value, valueMap.getOrPut(value, { 0 }) + 1)
        }

        return valueMap.size == valueMap.values.toSet().size
    }
}

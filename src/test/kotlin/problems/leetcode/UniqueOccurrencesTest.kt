package problems.leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class UniqueOccurrencesTest {

    val uniqueOccurrences = UniqueOccurrences()

    @Test
    fun `returns true with unique number of occurrences`() {
        val arr = intArrayOf(1, 2, 2, 1, 1, 3)
        assertTrue(uniqueOccurrences.uniqueOccurrences(arr))
    }

    @Test
    fun `returns false with repetitive number of occurrences`() {
        val arr = intArrayOf(1, 2, 2, 1, 1, 3, 3)
        assertFalse(uniqueOccurrences.uniqueOccurrences(arr))
    }
}
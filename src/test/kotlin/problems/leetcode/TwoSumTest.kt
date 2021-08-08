package problems.leetcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TwoSumTest {

    val twoSum = TwoSum()

    @Test
    fun `target is found and is 0 and 1`() {
        val arr = intArrayOf(2, 7, 11, 15)
        val target = 9

        assertTrue(twoSum.twoSum(arr, target).contentEquals(intArrayOf(0, 1)))
    }

    @Test
    fun `target is found and is 0 and 4`() {
        val arr = intArrayOf(1, 6, 77, 17, 3)
        val target = 4

        assertTrue(twoSum.twoSum(arr, target).contentEquals(intArrayOf(0, 4)))
    }
}
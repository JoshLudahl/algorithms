package problems.leetcode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ReverseTest {

    val reverseRecursiveString = Reverse()
    val original = "reverse"
    val reversed = "esrever"

    @Test
    fun `reverse string recursive`() = assertEquals(reversed, reverseRecursiveString.reverseStringRecursive(original))
    
}
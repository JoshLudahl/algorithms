package problems.leetcode

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class IsValidTest {

    val isValid = IsValid()

    @Test
    fun `string is valid1`() {
        val validString = "{[()]}"
        assertTrue(isValid.isValid(validString))
    }

    @Test
    fun `string is valid2`() {
        val validString = "{}()[]"
        assertTrue(isValid.isValid(validString))
    }

    @Test
    fun `string is valid3`() {
        val validString = "{()[]}"
        assertTrue(isValid.isValid(validString))
    }

    @Test
    fun `string is valid4`() {
        val validString = "[]{}()"
        assertTrue(isValid.isValid(validString))
    }

    @Test
    fun `string is invalid`() {
        val validString = "{][]}"
        assertFalse(isValid.isValid(validString))
    }
}
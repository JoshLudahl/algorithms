package problems.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CountMatchesTest {

    val countMatches = CountMatches()

    val list = listOf(
        listOf("phone", "blue", "pixel"),
        listOf("computer", "silver", "lenovo"),
        listOf("phone", "gold", "iphone")
    )

    @Test
    fun countMatches() {


        assertEquals(
            1,
            countMatches.countMatches(
                list,
                ruleKey = "color",
                ruleValue = "silver"
            )
        )
    }

    @Test
    fun `by value`() {
        assertEquals(
            2,
            countMatches.countMatches(
                list,
                ruleKey = "type",
                ruleValue = "phone"
            )
        )
    }
}
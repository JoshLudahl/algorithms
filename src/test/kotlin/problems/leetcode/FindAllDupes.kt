package problems.leetcode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.util.*

class FindAllDupes {

    var dupes = FindAllDuplicatesInArray()

    @Test
    fun findDuplicates() {
        Assertions.assertEquals(
            ArrayList(listOf(2, 3)),
            dupes.findDuplicates(intArrayOf(4, 3, 2, 7, 8, 2, 3, 1))
        )
    }
}

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SelectionSortTest {
    var sort = SelectionSort()

    @Test
    fun `empty list`() {
        assertEquals(listOf(), sort.sortArray(mutableListOf()))
    }

    @Test
    fun `one item`() {
        assertEquals(listOf(1), sort.sortArray(mutableListOf(1)))
        assertEquals(listOf(9), sort.sortArray(mutableListOf(9)))
    }

    @Test
    fun `even elements`() {
        assertEquals(listOf(1, 2), sort.sortArray(mutableListOf(2, 1)))
        assertEquals(listOf(1, 2, 5, 7), sort.sortArray(mutableListOf(2, 1, 5, 7)))
        assertEquals(listOf(1, 1, 2, 3, 6, 8), sort.sortArray(mutableListOf(2, 1, 1, 6, 8, 3)))
    }

    @Test
    fun `odd elements`() {
        assertEquals(listOf(1, 3, 6), sort.sortArray(mutableListOf(3, 1, 6)))
        assertEquals(listOf(1, 2, 3, 6, 7), sort.sortArray(mutableListOf(3, 1, 6, 2, 7)))
        assertEquals(listOf(1, 2, 3, 6, 7, 8, 11), sort.sortArray(mutableListOf(3, 1, 6, 7, 2, 11, 8)))
    }
}
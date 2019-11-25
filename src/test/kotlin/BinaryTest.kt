import org.junit.jupiter.api.Test

import kotlin.test.assertEquals

internal class BinaryTest {

    var binary = BinarySearch(6)

    @Test
    fun `empty array`() {
        assertEquals(false, binary.intSearch(listOf()))
    }

    @Test
    fun `one element`() {
        assertEquals(true, binary.intSearch(listOf(6)))
    }

    @Test
    fun `even elements`() {
        assertEquals(true, binary.intSearch(listOf(1, 6)))
        assertEquals(true, binary.intSearch(listOf(6, 9)))
        assertEquals(true, binary.intSearch(listOf(1, 2, 5, 6)))
        assertEquals(true, binary.intSearch(listOf(2, 6, 7, 9)))
        assertEquals(true, binary.intSearch(listOf(2, 3, 6, 7, 9, 10)))
        assertEquals(true, binary.intSearch(listOf(1, 2, 3, 4, 6, 7, 9, 10)))
    }

    @Test
    fun `odd elements`() {
        assertEquals(true, binary.intSearch(listOf(1, 6, 8)))
        assertEquals(true, binary.intSearch(listOf(6, 8, 9)))
        assertEquals(true, binary.intSearch(listOf(4, 5, 6)))
        assertEquals(true, binary.intSearch(listOf(4, 5, 6, 7, 8, 9, 10)))
        assertEquals(true, binary.intSearch(listOf(1, 2, 4, 5, 6, 9, 11)))
    }

    @Test
    fun `not in list`() {
        assertEquals(false, binary.intSearch(listOf(3, 4, 7, 8)))
    }

}
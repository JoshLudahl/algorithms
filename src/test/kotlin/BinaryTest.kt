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
    }

    @Test
    fun `odd elements`() {
        assertEquals(true, binary.intSearch(listOf(1, 6, 8)))
        assertEquals(true, binary.intSearch(listOf(6, 8, 9)))
        assertEquals(true, binary.intSearch(listOf(4, 5, 6)))
    }

}
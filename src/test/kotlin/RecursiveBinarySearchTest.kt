import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RecursiveBinarySearchTest {

    var search = RecursiveBinarySearch()
    var target = 7

    @Test
    fun `no elements`() {
        assertEquals(false, search.recursiveBinarySearch(listOf(), target))
        assertEquals(false, search.recursiveBinarySearch(listOf(3), target))
    }

    @Test
    fun `one element`() {
        assertEquals(true, search.recursiveBinarySearch(listOf(7), target))
        assertEquals(false, search.recursiveBinarySearch(listOf(4), target))
    }

    @Test
    fun `odd elements middle element`() {
        assertEquals(true, search.recursiveBinarySearch(listOf(1, 7, 9), target))
        assertEquals(true, search.recursiveBinarySearch(listOf(1, 3, 7, 8, 9), target))
        assertEquals(true, search.recursiveBinarySearch(listOf(1, 2, 3, 7, 8, 9, 10), target))
        assertEquals(true, search.recursiveBinarySearch(listOf(1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12), target))
        assertEquals(false, search.recursiveBinarySearch(listOf(1, 2, 3, 7, 8), target))
    }

    @Test
    fun `odd elements first half`() {
        //TODO
    }

    @Test
    fun `odd elements second half`() {
        //TODO
    }

    @Test
    fun `even elements first half`() {
        //TODO
    }

    @Test
    fun `even elements second half`() {
        //TODO
    }

}
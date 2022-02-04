import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

internal class BinarySearchTest {
    private val bs: BinarySearch = BinarySearch()
    @Test
    fun searchFound() {
        assertEquals(0, bs.search(intArrayOf(-1, 0, 3, 5, 9, 12), -1))
    }
    @Test
    fun searchNotFound() {
        assertEquals(-1, bs.search(intArrayOf(-1, 0, 3, 5, 9, 12), 2))
    }
}
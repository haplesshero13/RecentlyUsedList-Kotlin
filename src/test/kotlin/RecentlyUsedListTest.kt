import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("RecentlyUsedList")
class RecentlyUsedListTest {
    private lateinit var list: RecentlyUsedList

    @BeforeEach
    fun setUp() {
        list = RecentlyUsedList()
    }

    @Test
    @DisplayName("starts empty")
    fun testListStartsEmpty() {
        assertEquals(list.size, 0)
    }

    @Test
    @DisplayName("keeps the order of inserted elements")
    fun testInsert() {
        list.insert("first element")
        list.insert("second element")

        assertEquals(list.size, 2)
        assertEquals(list[0], "second element")
        assertEquals(list[1], "first element")
    }

    @Test
    @DisplayName("moves re-inserted elements to the front of the list")
    fun testInsertExistingElement() {
        list.insert("first element")
        list.insert("second element")
        list.insert("third element")
        list.insert("first element")

        assertEquals(list[0], "first element")
        assertEquals(list[1], "third element")
        assertEquals(list[2], "second element")
        assertEquals(list.size, 3)
    }
}

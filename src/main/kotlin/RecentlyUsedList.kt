class RecentlyUsedList {
    private var elements =
        mutableListOf<String>()

    val size: Int
        get() = elements.size

    operator fun get(i: Int): String =
        elements[i]

    fun insert(element: String) {
        elements.remove(element)
        elements.add(0, element)
    }
}

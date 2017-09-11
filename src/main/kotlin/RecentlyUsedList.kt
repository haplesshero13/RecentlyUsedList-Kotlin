class RecentlyUsedList {
    private var elements = mutableListOf<String>()

    val size: Int
        get() = elements.size

    operator fun get(i: Int): String {
        return elements[i]
    }

    fun insert(element: String) {
        val index = elements.indexOf(element)
        if (index > -1) {
            elements.removeAt(index)
        }
        elements.add(0, element)
    }
}

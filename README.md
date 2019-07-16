# Recently Used List

Develop a recently-used-list class to hold strings uniquely in Last-In-First-Out order.

* The most recently added item is first, the least recently added item is last.
* Items can be looked up by index, which counts from zero.
* Items in the list are unique, so duplicate insertions are moved rather than added.
* A recently-used-list is initially empty.
* The Recently Used List reports size equal to the number of items in the list.

*(Source: https://github.com/garora/TDD-Katas)*

## Interface

```kotlin
interface RecentlyUsedList {
    val size: Int
    operator fun get(i: Int) : String
    fun insert(element: String)
}
```
## Run the tests

1. Import the project in IntelliJ
    1. Click Import Project
    1. Open the `build.gradle` file
    1. Select "Use Auto-import" to make your life easier
1. Open `src/test/kotlin/RecentlyUsedListTest.kt` 
1. Run the JUnit test in the file

# BinarySearchKotlin

BinarySearch Implementation in Kotlin

## 我的解法

```kotlin
class BinarySearch {
    fun search(nums: IntArray, target: Int): Int {
        val start = 0
        val end = nums.lastIndex
        return binarySearch(nums, start, end, target)
    }
    private fun binarySearch(numbs: IntArray, start: Int, end: Int, target: Int): Int {
        val mid = (start + end) /2
        if (target == numbs[mid]) {
            return mid
        }
        if (end == start ) {
            return if ( target != numbs[mid]) {
                -1
            } else {
                start
            }
        }
        return if (numbs[mid] < target) {
            binarySearch(numbs, mid + 1, end, target)
        } else binarySearch(numbs, start, mid , target)
    }
}
```
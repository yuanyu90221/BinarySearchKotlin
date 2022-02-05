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

## reference my teacher Recca Chao's solution

[Recca Chao's kotlin kata binary search](https://gitpage.reccachao.net/kotlin/kata/binary-search/)

```kotlin
class BinarySearch {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.lastIndex
        while(left <= right) {
            val mid = (left + right) /2
            when {
                nums[mid] == target -> return mid
                nums[mid] > target -> right = mid - 1
                nums[mid] < target -> left = mid + 1
            }
        }
        return -1
    }
}
```

透過 while 與 when 的語法, 讓整個語法結構更加清晰
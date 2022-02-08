import kotlin.math.floor

class Solution {
    fun search(nums: IntArray, target: Int): Int {

        var initialIndex = 0
        var endIndex = nums.size - 1

        while (initialIndex <= endIndex) {
            val midIndex = (initialIndex + floor((endIndex - initialIndex) / 2f)).toInt()
            if (target == nums[midIndex]) return midIndex

            when {
                target > nums[midIndex] -> initialIndex = midIndex + 1
                target < nums[midIndex] -> endIndex = midIndex - 1
            }
        }
        return -1
    }
}

class RecursiveSolution {
    fun search(nums: IntArray, target: Int): Int {
        return if (nums.isEmpty()) {
            -1
        } else {
            bsearch(nums, target, 0, nums.size - 1)
        }
    }

    private fun bsearch(nums: IntArray, target: Int, left: Int, right: Int): Int {
        if (left <= right) {
            val midIndex = left + floor((right - left) / 2f).toInt()
            return when {
                target == nums[midIndex] -> midIndex
                target > nums[midIndex] -> bsearch(nums, target, midIndex + 1, right)
                else -> bsearch(nums, target, left, midIndex - 1)
            }
        }
        return -1
    }
}

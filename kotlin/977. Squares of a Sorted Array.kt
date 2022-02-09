import kotlin.math.abs

class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        return nums.map {
            it * it
        }.sorted()
            .toIntArray()
    }
}

class TwoPointerSolution {
    fun sortedSquares(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        var start = 0
        var end = nums.size - 1

        for (i in nums.indices.reversed()) {
            if (abs(nums[start]) > abs(nums[end])) {
                result[i] = nums[start] * nums[start]
                start++
            } else {
                result[i] = nums[end] * nums[end]
                end--
            }
        }
        return result
    }
}

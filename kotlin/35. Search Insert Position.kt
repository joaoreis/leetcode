import kotlin.math.floor

class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {

        var start = 0
        var end = nums.size - 1
        var mid: Int

        while (start <= end) {
            mid = start + floor((end - start) / 2f).toInt()
            when {
                target == nums[mid] -> return mid
                target < nums[mid] -> end = mid - 1
                else -> start = mid + 1
            }
        }
        return start
    }
}

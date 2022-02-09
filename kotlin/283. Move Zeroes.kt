class Solution {
    fun moveZeroes(nums: IntArray) {
        val ans = nums.copyOf()
        var index = 0
        var zeroes = 0

        for (i in ans.indices) {
            if (ans[i] == 0) {
                zeroes++
            } else {
                nums[index] = ans[i]
                index++
            }
        }
        for (i in index until ans.size) {
            nums[i] = 0
        }
    }
}

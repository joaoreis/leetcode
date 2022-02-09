class Solution {
    fun rotate(nums: IntArray, k: Int) {
        var rotations = k
        while (rotations > nums.size) {
            rotations -= nums.size
        }

        val temp = nums.copyOf()

        for (i in nums.indices) {
            if (i < rotations) {
                nums[i] = temp[nums.size - rotations + i]
            } else {
                nums[i] = temp[i - rotations]
            }
        }
    }
}

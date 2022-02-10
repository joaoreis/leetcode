class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {

        var start = 0
        var end = numbers.size - 1
        var sum : Int
        while (start < end) {
            sum = numbers[start] + numbers[end]
            when {
                sum > target -> end--
                sum < target -> start++
                else -> return intArrayOf(start + 1, end + 1)
            }
        }
        return intArrayOf(-1, -1)
    }
}

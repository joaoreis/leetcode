class Solution {
    fun reverseString(s: CharArray) {
        var start = 0
        var end = s.size - 1

        while (start <= end) {
            swap(s, start, end)
            start++
            end--
        }
    }

    private fun swap(array: CharArray, i: Int, j: Int) {
        val temp = array[i]
        array[i] = array[j]
        array[j] = temp
    }
}

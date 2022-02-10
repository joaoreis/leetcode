class Solution {
    fun reverseWords(s: String): String {
        val array = s.toCharArray()
        var start = 0
        var end = 0

        while (end <= array.size) {
            if (end == array.size || array[end] == ' ') {
                reverse(array, start, end - 1)
                end++
                start = end
            } else {
                end++
            }
        }
        return String(array)
    }

    private fun reverse(array: CharArray, i: Int, j: Int) {
        var i = i
        var j = j
        var temp: Char
        while (i < j) {
            temp = array[i]
            array[i] = array[j]
            array[j] = temp
            i++
            j--
        }
    }
}

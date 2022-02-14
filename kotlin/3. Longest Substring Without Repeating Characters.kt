import kotlin.math.max

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

        val letters = mutableSetOf<Char>()
        var max = 0
        var start = 0
        var end = 0

        while (end < s.length) {
            if (!letters.contains(s[end])) {
                letters.add(s[end])
                max = max(letters.size, max)
                end++
            } else {
                letters.remove(s[start])
                start++
            }

        }
        return max
    }
}

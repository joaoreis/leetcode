/* The isBadVersion API is defined in the parent class VersionControl.
      fun isBadVersion(version: Int) : Boolean {} */
import kotlin.math.floor

class Solution : VersionControl() {

    override fun firstBadVersion(n: Int): Int {

        var start = 1
        var end = n
        var mid: Int
        while (start < end) {
            mid = start + floor((end - start) / 2f).toInt()
            if (isBadVersion(mid))
                end = mid
            else
                start = mid + 1
        }
        return start
    }
}

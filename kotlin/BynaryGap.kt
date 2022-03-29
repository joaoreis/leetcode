import kotlin.math.max

// you can also use imports, for example:
// import kotlin.math.*

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

fun solution(N: Int): Int {
    // write your code in Kotlin 1.3.11 (Linux)
    val nBynary = toBinary(N)
    println(nBynary)
    var maxGap = 0
    var startIndex = -1
    var count = 0

    nBynary.forEachIndexed { index, c ->
        if(startIndex >= 0) {
            if (c == '1') {
                maxGap = max(maxGap, count)
                count = 0
                startIndex = index
            } else {
                count++
            }
        } else {
            if (c == '1') startIndex = index
        }
    }
    return maxGap
}

fun toBinary(n: Int): String {

    var current = n
    var quotient :Int
    var remainder : Int
    var result = ""

    while (current > 0 ) {
        quotient = current/2
        remainder = current % 2
        result+= remainder
        current = quotient
    }
    return result.reversed()
}

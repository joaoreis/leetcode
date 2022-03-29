/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 * https://www.hackerrank.com/challenges/one-week-preparation-kit-plus-minus/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-one
 */

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    var positives = 0
    var negatives = 0
    var zeros = 0

    arr.forEach {
        when {
            it > 0 -> positives++
            it < 0 -> negatives++
            else -> zeros++
        }
    }
    println( "%.6f".format(positives / arr.size.toDouble()))
    println( "%.6f".format(negatives / arr.size.toDouble()))
    println( "%.6f".format(zeros / arr.size.toDouble()))

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    plusMinus(arr)
}

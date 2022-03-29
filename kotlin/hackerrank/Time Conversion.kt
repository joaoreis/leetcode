import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    val hour = s.subSequence(0, 2).toString()
    val minute = s.subSequence(3, 5).toString()
    val second = s.subSequence(6, 8).toString()
    val ampm = s.subSequence(8, 10).toString()
    val fmtHour = when (ampm) {
        "AM" -> if (hour == "12") "00" else hour
        else -> if (hour == "12") hour.toInt() else {
            if (hour.toInt() + 12 >= 24) "00" else (hour.toInt() + 12).toString()
        }
    }
    return "$fmtHour:$minute:$second"
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}

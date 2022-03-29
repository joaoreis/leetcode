import kotlin.math.max

/*
 * Complete the 'flippingMatrix' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
 */

fun flippingMatrix(matrix: Array<Array<Int>>): Int {
    val sizeTopLeftMatrix = matrix.first().size / 2
    val symmetric = 2 * sizeTopLeftMatrix - 1
    var sum = 0
    for (i in 0 until sizeTopLeftMatrix) {
        for (j in 0 until sizeTopLeftMatrix) {
            println("$i,$j")
            val max =
                max(
                    max(
                        max(matrix[i][j], matrix[i][symmetric - j]),
                        matrix[symmetric - i][j]
                    ),
                    matrix[symmetric - i][symmetric - j]
                )
            sum += max
        }
    }
    return sum
}

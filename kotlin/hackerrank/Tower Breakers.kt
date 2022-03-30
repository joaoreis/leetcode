/*
 * Complete the 'towerBreakers' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER m
 */


fun towerBreakers(n: Int, m: Int): Int {
    if (m == 1 ) return 2

    return if (n % 2 == 0) {
        2
    } else {
        1
    }
}

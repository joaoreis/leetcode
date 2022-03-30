fun caesarCipher(s: String, k: Int): String {
    val sb = StringBuilder()
    var charPosition: Int
    val minuscles = Array(26) { ('a'.code + it).toChar()}
    val maiuscles = Array(26) { ('A'.code + it).toChar()}

    s.forEach {

        when {
            it.isLowerCase() -> {
                charPosition = (minuscles.indexOf(it)  + k) % 26
                sb.append(minuscles[charPosition])
            }
            it.isUpperCase() -> {
                charPosition = (maiuscles.indexOf(it)  + k) % 26
                sb.append(maiuscles[charPosition])
            }
            else -> sb.append(it)
        }
    }
    return sb.toString()

}

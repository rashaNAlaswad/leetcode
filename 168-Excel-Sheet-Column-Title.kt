class Solution {
    fun convertToTitle(columnNumber: Int): String {
    var number = columnNumber
    val result = StringBuilder()

    while (number > 0) {
        number--
        val remainder = number % 26
        result.append((65 + remainder).toChar())
        number /= 26
    }

    return result.reverse().toString()       
    }
}
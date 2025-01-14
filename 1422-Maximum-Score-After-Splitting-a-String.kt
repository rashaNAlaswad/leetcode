class Solution {
    fun maxScore(s: String): Int {
        var zeros =0
        var ones = s.count() { it=='1' }
        var result =0

        for (i in 0..<s.length-1) {
            if (s[i] == '0') {
                zeros++
            } else {
                ones--
            }
            result = max(result, zeros + ones)
        }
        return result     
    }
}
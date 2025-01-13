class Solution {
    fun minimumLength(s: String): Int {
        val frequency = IntArray(26)

        for (i in s.indices) {
            frequency[s[i] - 'a']++
        }

        var sum = 0
        for (i in frequency.indices) {
            if (frequency[i] >= 1) {
                if (frequency[i] % 2 == 0) {
                    sum += 2
                } else {
                    sum += 1
                }
            }
        }
        return sum 
    }
}
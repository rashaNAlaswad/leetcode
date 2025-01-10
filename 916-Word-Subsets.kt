class Solution {
    fun wordSubsets(words1: Array<String>, words2: Array<String>): List<String> {

        val maxFreq = mutableMapOf<Char, Int>()
        for (word in words2) {
            val freq = mutableMapOf<Char, Int>()
            for (char in word) {
                freq[char] = freq.getOrDefault(char, 0) + 1
            }
            for ((char, count) in freq) {
                maxFreq[char] = maxOf(maxFreq.getOrDefault(char, 0), count)
            }
         }

    return words1.filter { word ->
        val freq = mutableMapOf<Char, Int>()
        for (char in word) {
            freq[char] = freq.getOrDefault(char, 0) + 1
        }
        for ((char, count) in maxFreq) {
            if (freq.getOrDefault(char, 0) < count) return@filter false
         }
         true
        }
    }
}
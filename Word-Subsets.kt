class Solution {
    fun wordSubsets(words1: Array<String>, words2: Array<String>): List<String> {
        var maxFreq = IntArray(26)
        
        for(word in words2){
            val freq = IntArray(26)
            for(char in word){
                freq[char - 'a']++
            }
            for(i in 0 until 26){
                maxFreq[i] = maxOf(maxFreq[i], freq[i])
            }
        }

        val result = mutableListOf<String>()
        for (word in words1) {
            if (isSuperset(word, maxFreq)) {
                result.add(word)
            }
        }
        return result
    }

    fun isSuperset(word: String, maxFreq: IntArray): Boolean {
        val freq = IntArray(26)
        for (char in word) {
            freq[char - 'a']++
        }
        for (i in 0 until 26) {
            if (freq[i] < maxFreq[i]) {
                return false
            }
        }
        return true
    }
}
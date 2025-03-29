class Solution {
    fun stringMatching(words: Array<String>): List<String> {
        val result = mutableSetOf<String>()
        
        for (i in words.indices) {
            for (j in words.indices) {
                if (i != j && words[j].contains(words[i])) {
                    result.add(words[i])
                }
            }
        }
        return result.toList()      
    }
}
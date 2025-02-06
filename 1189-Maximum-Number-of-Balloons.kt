class Solution {
    fun maxNumberOfBalloons(text: String): Int {
        val freq = mutableMapOf<Char, Int>()

        for(char in text){
            freq[char] = freq.getOrDefault(char, 0) + 1
        }

        return minOf(
            freq.getOrDefault('b', 0),
            freq.getOrDefault('a', 0),
            freq.getOrDefault('l', 0) / 2,
            freq.getOrDefault('o', 0) / 2,
            freq.getOrDefault('n', 0)
        )  
    }
}
class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) return 0

        var maxLength = 0
        val charSet = mutableSetOf<Char>()
        var start = 0
        for(i in s.indices){
            while(charSet.contains(s[i])){
                charSet.remove(s[start])
                start++
            }
            charSet.add(s[i])
            maxLength = maxOf(maxLength, i - start + 1)
        }
        return maxLength
    }
}
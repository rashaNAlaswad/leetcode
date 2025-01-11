class Solution {
    fun canConstruct(s: String, k: Int): Boolean {
        if (k > s.length) return false
        
        val charCount = IntArray(26)
        for(char in s){
            charCount[char - 'a']++
        }

        val odd = charCount.count{it%2 == 1}

       return odd <= k
    }
}
class Solution {
    fun countPalindromicSubsequence(s: String): Int {
        var count = 0
        for(character in 'a'..'z'){
            val first = s.indexOf(character)
            val last = s.lastIndexOf(character)
            
            if(first < last){
                val middleCharacters = mutableSetOf<Char>()
                for(i in first+1 until last){
                    middleCharacters.add(s[i])
                }
                count += middleCharacters.size
            }
        }
        return count  
    }
}
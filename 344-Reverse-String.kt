class Solution {
    fun reverseString(s: CharArray): Unit {
        for (i in 0 until s.size/2){
            s[i] = s[s.size-1-i].also { 
                s[s.size-1-i] = s[i]
            }
        }    
    }
}
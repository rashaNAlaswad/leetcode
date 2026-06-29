1class Solution {
2    fun isAnagram(s: String, t: String): Boolean {
3        if(s.length != t.length) return false
4        val count = IntArray(26)
5        for(char in s){
6            count[char - 'a']++
7        }
8        for(char in t){
9            count[char - 'a']--
10        }
11        for (num in count) {
12        if (num != 0) return false
13    }
14    return true
15    }
16}
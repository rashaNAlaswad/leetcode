1class Solution {
2    fun isAnagram(s: String, t: String): Boolean {
3        if(s.length != t.length) return false
4
5        val map = HashMap<Char,Int>()
6        for(char in s){
7            map[char] = map.getOrDefault(char,0)+1
8        }
9
10        for(char in t){
11            var count = map.getOrDefault(char,0)
12            if(count <1) return false
13            map[char] = count -1
14        }
15        return true
16    }
17}
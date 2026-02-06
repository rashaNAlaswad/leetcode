1class Solution {
2    fun groupAnagrams(strs: Array<String>): List<List<String>> {
3        if (strs.isEmpty()) return emptyList()
4        val map = mutableMapOf<String, MutableList<String>>()
5
6        for(i in strs){
7            val key = i.toCharArray().sorted().joinToString("")
8            if(!map.containsKey(key)){
9                map[key]= mutableListOf<String>()
10            }
11            map[key]?.add(i)
12        }
13        return map.values.toList()
14    }
15}
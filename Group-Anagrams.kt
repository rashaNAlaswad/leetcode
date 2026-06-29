1class Solution {
2    fun groupAnagrams(strs: Array<String>): List<List<String>> {
3        val map = HashMap<String, MutableList<String>>()
4
5        for(word in strs){
6            val count = IntArray(26)
7            for(char in word){
8                count[char - 'a']++
9            }
10            val key = count.joinToString(",")
11
12            // if (!map.containsKey(key)) {
13            //     map[key] = mutableListOf()
14            // }
15            // map[key]!!.add(word)
16
17            map.getOrPut(key){ mutableListOf() }.add(word)
18        }
19        return map.values.toList()
20    }
21}
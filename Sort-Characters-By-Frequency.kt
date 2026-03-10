1class Solution {
2    fun frequencySort(s: String): String {
3        val map = HashMap<Char,Int>()
4        for(i in s){
5            map[i] = map.getOrDefault(i,0)+1
6        }
7        val buckets = Array(s.length + 1) { mutableListOf<Char>() }
8
9        for ((char, freq) in map) {
10            buckets[freq].add(char)
11        }
12
13        val result = StringBuilder()
14        for(freq in buckets.size - 1 downTo 1){
15            for(char in buckets[freq]){
16                repeat(freq) {
17                    result.append(char)
18                }
19            }
20        }
21        return result.toString()
22    }
23}
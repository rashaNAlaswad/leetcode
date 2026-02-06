1class Solution {
2    fun topKFrequent(nums: IntArray, k: Int): IntArray {
3        val map = mutableMapOf<Int, Int>()
4        for(num in nums){
5            map[num] = map.getOrDefault(num,0)+1
6        }
7
8        val soretedEntries = map.entries.sortedByDescending{it.value}
9
10        var result = IntArray(k)
11        for(i in 0 until k){
12            result[i] = soretedEntries[i].key
13        }
14
15        return result
16    }
17}
1class Solution {
2    fun topKFrequent(nums: IntArray, k: Int): IntArray {
3        val map = mutableMapOf<Int,Int>()
4        for(i in nums){
5            map[i] = map.getOrDefault(i,0)+1
6        }
7
8        val buckets = Array<MutableList<Int>>(nums.size + 1) {mutableListOf()}
9        for((num, freq) in map){
10            buckets[freq].add(num)
11        }
12
13        val result = mutableListOf<Int>()
14
15        for(freq in buckets.size-1 downTo 1){
16            for(num in buckets[freq]){
17                result.add(num)
18                if(result.size==k) return result.toIntArray()
19            }
20        }
21        return result.toIntArray()
22    }
23}
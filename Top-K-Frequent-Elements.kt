1class Solution {
2    fun topKFrequent(nums: IntArray, k: Int): IntArray {
3        val map = HashMap<Int,Int>()
4        for(num in nums){
5            map[num] = map.getOrDefault(num, 0)+1
6        }
7
8        val bucket = Array(nums.size +1) {mutableListOf<Int>()}
9        for((num, freq) in map){
10            bucket[freq].add(num)
11        }
12
13        val result = mutableListOf<Int>()
14        for(freq in bucket.size - 1 downTo 0){
15            for(num in bucket[freq]){
16                result.add(num)
17            
18            if(result.size == k){
19                return result.toIntArray()
20                }
21            }
22        }
23        return result.toIntArray()
24    }
25}
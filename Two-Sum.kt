1class Solution {
2    fun twoSum(nums: IntArray, target: Int): IntArray {
3        val map = mutableMapOf<Int,Int>()
4        for(i in nums.indices){
5            val complement = target - nums[i]
6            if(map.containsKey(complement)){
7                return intArrayOf(i, map[complement]!!)
8            }
9            map[nums[i]] = i
10        }
11        return intArrayOf()
12    }
13}
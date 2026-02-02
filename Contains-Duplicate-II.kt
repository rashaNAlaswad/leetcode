1class Solution {
2    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
3        val tempMap = mutableMapOf<Int,Int>()
4        for(i in nums.indices){
5            if(tempMap.containsKey(nums[i]) && i - tempMap[nums[i]]!! <= k){
6                return true
7            }
8            tempMap[nums[i]] = i
9        }
10        return false
11    }
12}
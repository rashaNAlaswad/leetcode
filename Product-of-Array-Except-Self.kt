1class Solution {
2    fun productExceptSelf(nums: IntArray): IntArray {
3        val result = IntArray(nums.size)
4
5        result[0]=1
6        for(i in 1 until nums.size){
7            result[i]= result[i-1] * nums[i-1]
8        }
9
10        var suffix = 1
11        for(i in nums.size-1 downTo 0){
12            result[i] *= suffix
13            suffix *= nums[i] 
14        }
15        return result
16    }
17}
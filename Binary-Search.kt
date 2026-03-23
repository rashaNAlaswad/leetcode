1class Solution {
2    fun search(nums: IntArray, target: Int): Int {
3        var left = 0
4        var right = nums.size -1
5        while(left <= right){
6            val mid = (left + right)/2
7
8            when{
9                nums[mid] ==target -> return mid
10                nums[mid] < target -> left = mid +1
11                else -> right = mid -1
12            }
13        }
14        return -1
15    }
16}
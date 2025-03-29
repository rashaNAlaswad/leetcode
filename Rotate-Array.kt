class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        val steps = k % nums.size
        reverse(nums,0, nums.size-1)        
        reverse(nums, 0, steps-1)
        reverse(nums, steps, nums.size-1)

    }

    fun reverse(nums: IntArray, start:Int, end:Int){
        var left = start
        var right = end
        while(left < right){
            var temp = nums[left]
            nums[left] = nums[right]
            nums[right] = temp
            left++
            right--
        }
    }
}
class Solution {
    fun sortColors(nums: IntArray): Unit {
        var low =0
        var high = nums.size-1
        var curr =0
        while(curr <= high){
            when(nums[curr]){
                0 -> {
                    val temp = nums[low]
                    nums[low] = nums[curr]
                    nums[curr] = temp
                    low++
                    curr++
                }
                1 -> curr++
                2 -> {
                    val temp = nums[high]
                    nums[high] = nums[curr]
                    nums[curr] = temp
                    high--
                }
            }
        }
    }
}
class Solution {
    fun partitionDisjoint(nums: IntArray): Int {
        // max(Left) <= min(Right)
        var leftMax = nums[0]
        var currentMax = nums[0]
        var partIndex = 0

        for(i in 1 until nums.size){
            currentMax = max(currentMax, nums[i])
            if(nums[i] < leftMax){
                partIndex =i
                leftMax = currentMax
            }
        }
        return partIndex +1
    }
}
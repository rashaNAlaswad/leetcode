class Solution {
    fun findDuplicate(nums: IntArray): Int {
        var i =0
        while(i < nums.size){
            val currectIndex = nums[i] -1
            if(nums[i] != i+1 && nums[i] != nums[currectIndex]){
                val temp = nums[i]
                nums[i] = nums[currectIndex]
                nums[currectIndex] = temp
            } else{
                i++
            }
        }

        for(i in nums.indices){
            if(nums[i] != i+1){
                return nums[i]
            } 
        }
        return -1
    }
}
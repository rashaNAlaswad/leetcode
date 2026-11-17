class Solution {
    fun missingNumber(nums: IntArray): Int {
        var i = 0
        while(i <nums.size){
            val correctIndex = nums[i]
            if( nums[i] <nums.size && nums[i] != nums[correctIndex]){
                val temp = nums[i]
                nums[i] = nums[correctIndex]
                nums[correctIndex] = temp
            }else{
                i++
            }
        }

        for(i in nums.indices){
            if (nums[i] != i) return i
        }

        return nums.size
    }
}
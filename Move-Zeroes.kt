class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var insertPosition = 0
        for(i in 0 until nums.size){
            if(nums[i] != 0){
                nums[insertPosition] = nums[i]
                insertPosition ++
            }            
        }
        for(i in insertPosition until nums.size){
            nums[i]=0
        }
    }
}
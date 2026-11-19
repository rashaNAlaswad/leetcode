class Solution {
    fun findErrorNums(nums: IntArray): IntArray {
        var i =0
        while(i < nums.size){
            val correctIndex = nums[i] -1
            if(nums[i] != nums[correctIndex]){
                val temp = nums[i]
                nums[i] = nums[correctIndex]
                nums[correctIndex] = temp
            }else{
                i++
            }
        }

        for(i in nums.indices){
            if(nums[i] != i+1){
                return intArrayOf(nums[i], i + 1)
            }
        }

        return intArrayOf()
    }
}
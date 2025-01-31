class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var x = 0
        for(i in nums.indices){
            if(nums[i] != `val`){
                nums[x] = nums[i]
                x++
            }
        }
        return x
    }
}
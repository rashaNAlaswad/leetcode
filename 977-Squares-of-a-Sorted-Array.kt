class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        var left =0
        var right = nums.size -1
        val ans = IntArray(nums.size)
        var index = nums.size -1
        while(left <= right){
            val leftSquare = nums[left] * nums[left]
            val rightSquare = nums[right] * nums[right]
            if(leftSquare > rightSquare){
                ans[index] = leftSquare
                left++
            } else{
                ans[index] = rightSquare
                right--
            }
            index--
        }
        return ans
    }
}
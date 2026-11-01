class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var start = 0
        var end= nums.size-1
        while(start <= end){
            val mid = (start + end)/2
            when{
                nums[mid] == target -> return mid
                nums[mid] > target -> end= mid-1
                else -> start= mid+1
            }
        } 
        return -1
    }
}
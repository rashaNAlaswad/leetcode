class Solution {
    fun findPeakElement(nums: IntArray): Int {
        if(nums.size ==1 || nums[0] > nums[1]) return 0

        if(nums[nums.size-1] > nums[nums.size-2]) return nums.size-1

        var start = 1
        var end = nums.size-2
        while(start <= end){
            val mid = (start + end) /2
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1] ) return mid

            if (nums[mid] <= nums[mid+1]){
                start = mid +1
            } else{
                end = mid -1
            }
        }
        return -1
    }
}
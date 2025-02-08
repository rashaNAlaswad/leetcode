class Solution {
    fun sortColors(nums: IntArray): Unit {
       var start = 0
       var current = 0
       var end = nums.size -1

        while(current <= end){
            when(nums[current]){
                0 ->{
                    swap(nums, start, current)
                    start++
                    current++
                }
                1 -> current++
                2 ->{
                    swap(nums, current, end)
                    end--
                }
            }
        }
    }

    fun swap(nums: IntArray, i: Int, j: Int){
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }
}
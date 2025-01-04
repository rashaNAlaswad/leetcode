class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        var list = mutableListOf<Int>()
        for(num in nums){
            if (num in list){
                return true
            }
            list.add(num)
        }
        return false
    }
}
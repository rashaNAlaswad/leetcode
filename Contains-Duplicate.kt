class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val hashArray = HashSet<Int>()
        for(num in nums){
            if(hashArray.contains(num)) return true
            else hashArray.add(num)
        }
        return false
    }
}
class Solution {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val stack = ArrayDeque<Int>()
        val map = HashMap<Int,Int>()
        val result = IntArray(nums1.size)

        for(num in nums2){
            while(stack.isNotEmpty() && num > stack.last()){
                map[stack.removeLast()] = num
            }
            stack.addLast(num)
        }
        while(stack.isNotEmpty()){
             map[stack.removeLast()] = -1
        }

        for (i in nums1.indices) {
            result[i] = map[nums1[i]]!!
        }
        return result
    }
}
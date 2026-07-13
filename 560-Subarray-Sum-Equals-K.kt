class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        var count =0
        var currentSum = 0
        val prefixSumMap = HashMap<Int, Int>()

        // key -> sum
        // value -> count
        prefixSumMap[0] = 1

        for(num in nums){
            currentSum += num

            val targetSum = currentSum - k
            if(prefixSumMap.containsKey(targetSum)){
                count += prefixSumMap[targetSum]!!
            }
            prefixSumMap[currentSum] = prefixSumMap.getOrDefault(currentSum, 0) +1
        }
        return count
    }
}
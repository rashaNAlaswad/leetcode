class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for(num in nums){
            map[num] = map.getOrDefault(num,0)+1
        }

        val soretedEntries = map.entries.sortedByDescending{it.value}

        var result = IntArray(k)
        for(i in 0 until k){
            result[i] = soretedEntries[i].key
        }

        return result
    }
}
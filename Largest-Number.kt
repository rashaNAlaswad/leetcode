class Solution {
    fun largestNumber(nums: IntArray): String {
        val numsToString = nums.map{it.toString()}

        val sorted = numsToString.sortedWith{a, b ->
        (b+a).compareTo(a+b)
        }

        return if (sorted[0] == \0\) \0\ else sorted.joinToString(\\)
    }
}
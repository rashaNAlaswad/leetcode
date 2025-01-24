class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var index1 = 0
        var index2 = numbers.size -1

        while(index1 < index2){
            val sum = numbers[index1] + numbers[index2]
            if(sum > target){
                index2--
            } else if(sum < target){
                index1++
            } else {
                return intArrayOf(index1 +1, index2 +1)
            }
        }

        return intArrayOf(-1, -1)
    }
}
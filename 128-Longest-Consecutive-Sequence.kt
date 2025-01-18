class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if(nums.isEmpty()) return 0

        val numberSet= nums.toSet()
        var longestStreak = 0
        for(currentNumber in numberSet){
            if(!numberSet.contains(currentNumber-1)){
                var nextNumber = currentNumber + 1
                var currentStreak = 1
                
                while(numberSet.contains(nextNumber)){
                    nextNumber ++
                    currentStreak ++
                }
                longestStreak= maxOf(longestStreak, currentStreak)
            }
        }
        return longestStreak       
    }
}
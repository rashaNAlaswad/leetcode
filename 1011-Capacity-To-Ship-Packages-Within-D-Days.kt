class Solution {
    fun shipWithinDays(weights: IntArray, days: Int): Int {
        var start = getMax(weights)
        var end = getSum(weights)
        var ans = 0
        while(start <= end){
            var mid = start + (end -start) /2
            var takenDays = calculateDays(weights, mid)
            if(takenDays <= days){
                ans = mid
                end = mid -1
            } else{
                start = mid +1
            }
        }
        return ans
    }

    fun calculateDays(weights: IntArray, totalCapacity : Int) : Int{
        var days = 1
        var currentCapacity = 0
        for(weight in weights){
            if(currentCapacity + weight <= totalCapacity){
                currentCapacity += weight
            } else{
                days++
                currentCapacity = weight
            }
        }
        return days
    }

    fun getSum(weights: IntArray) :Int{
        var sum = 0
        for(weight in weights){
            sum += weight
        }
        return sum
    }

    fun getMax(weights: IntArray) :Int{
        var max = weights[0]
        for(weight in weights){
            if(max < weight){
                max = weight
            }
        }
        return max
    }
}
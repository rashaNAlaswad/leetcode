class Solution {
    fun numRescueBoats(people: IntArray, limit: Int): Int {
        people.sort()

        var boats =0
        var left=0
        var right=people.size-1
        while(left <= right){
            if(left<right && people[left]+people[right] <= limit){
                left++
                right--
            }else{
                right--
            }
            boats++
        }
        return boats
    }
}
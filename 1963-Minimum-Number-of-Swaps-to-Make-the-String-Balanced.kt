class Solution {
    fun minSwaps(s: String): Int {
        var extraClose = 0
        var maxClose = 0
        for(bracket in s){
            if(bracket == ']'){
                extraClose++
                maxClose = maxOf(maxClose, extraClose)
            } else {
                extraClose--
            }
        }
        return (maxClose+1)/2
    }
}
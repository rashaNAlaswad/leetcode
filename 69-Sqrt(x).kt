class Solution {
    fun mySqrt(x: Int): Int {
        var start = 0
        var end = x
        var ans = 0
        while(start <= end){
            var mid = start + (end - start) / 2

            if(mid.toLong() * mid.toLong() <= x){
                ans = mid
                start = mid+1
            }else{
                end = mid-1
            }
        }
        return ans
    }
}
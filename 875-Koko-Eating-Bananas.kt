class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var start = 1
        var end = getMax(piles)
        var ans = 0
        while(start <= end){
            val mid = start + (end - start) /2
            val takinTime = calculateTime(mid, piles)
            if(takinTime <= h){
                ans = mid
                end = mid-1
            } else{
                start = mid +1
            }
        }
        return ans
    }

    fun calculateTime(k: Int,piles: IntArray ) : Long{
        var time = 0L
        for(pile in piles){
            time += pile/k

            if(pile % k != 0){
                time++
            }
        }
        return time
    }


    fun getMax(piles: IntArray) : Int{
        var max = piles[0]
        for(pile in piles){
            if(pile > max)
            max = pile
        }
        return max
    }
}
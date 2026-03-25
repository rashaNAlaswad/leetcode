1class Solution {
2    fun minEatingSpeed(piles: IntArray, h: Int): Int {
3        var left = 1
4        var right = piles.maxOrNull() ?: 1
5
6        while(left < right){
7            val mid = (right + left) /2
8
9            var hours = 0
10            for(pile in piles){
11                hours += (pile + mid -1)/mid
12            }
13
14            if(hours > h){
15                left = mid +1
16            } else{
17                right = mid
18            }
19        }
20        return left
21    }
22}
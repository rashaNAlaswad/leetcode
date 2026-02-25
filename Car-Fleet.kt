1class Solution {
2    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
3        val cars = position.zip(speed).sortedByDescending{it.first}
4        var maxTime =0.0
5        var fleet = 0
6        for((pos, speed) in cars){
7            val time = (target-pos).toDouble()/speed
8            if(time > maxTime){
9                fleet++
10                maxTime = time
11            }
12        }
13        return fleet
14    }
15}
class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        if(position.isEmpty()) return 0

        val cars = position.zip(speed).sortedByDescending{it.first}
        val stack = ArrayDeque<Double>()

        for((pos, spe) in cars){
            val time = (target-pos).toDouble() / spe
            if(stack.isEmpty() || time > stack.last()){
                stack.addLast(time)
            }
        }
        return stack.size
    }
}
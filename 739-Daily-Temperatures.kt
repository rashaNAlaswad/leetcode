class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val answer = IntArray(temperatures.size)
        val stack = ArrayDeque<Int>()

        for(i in temperatures.indices){
            while(stack.isNotEmpty() && temperatures[i] > temperatures[stack.last()]){
                val prevIndex = stack.removeLast()
                answer[prevIndex] = i - prevIndex
            }
            stack.addLast(i)
        }
        return answer
    }
}
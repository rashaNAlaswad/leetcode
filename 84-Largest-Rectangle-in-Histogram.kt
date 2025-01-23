class Solution {
    fun largestRectangleArea(heights: IntArray): Int {
        val stack = ArrayDeque<Int>()
        var maxArea = 0

        for(index in heights.indices){
            while(stack.isNotEmpty() && heights[index] < heights[stack.last()]){
                val height = heights[stack.removeLast()]
                val width = if(stack.isEmpty()) index else index - stack.last() -1
                val area = height * width
                maxArea = maxOf(maxArea, area)
            }
            stack.addLast(index)
        }

        while(stack.isNotEmpty()){
            val height = heights[stack.removeLast()]
            val width = if(stack.isEmpty()) heights.size else heights.size - stack.last() -1
            val area = height * width
            maxArea = maxOf(maxArea, area)
        }
        return maxArea    
    }
}
class Solution {
    fun trap(height: IntArray): Int {
        if (height.isEmpty()) return 0
        
        var left = 0
        var right = height.size -1
        var leftMax = 0
        var rightMax = 0
        var result = 0

        while(left <= right){
            if(height[left] <= height[right]){
                if(height[left] < leftMax){
                    result += leftMax - height[left]
                }else{
                    leftMax = height[left]
                }
                left++
            }else{
                if(height[right] < rightMax){
                    result += rightMax - height[right]
                }else{
                    rightMax = height[right]
                }
                right--
            }
        }
        return result
    }
}
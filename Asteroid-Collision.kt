class Solution {
    fun asteroidCollision(asteroids: IntArray): IntArray {
        val stack = mutableListOf<Int>()
        for (ast in asteroids) {
            if (ast > 0) {
                stack.add(ast)
            } else {            
                var survives = true
                while (stack.isNotEmpty() && stack.last() > 0) {
                    if (kotlin.math.abs(ast) > stack.last()) {
                        stack.removeAt(stack.lastIndex)
                    } else if (kotlin.math.abs(ast) == stack.last()) {
                        stack.removeAt(stack.lastIndex)                    
                        survives = false
                        break
                    } else {                    
                        survives = false
                        break
                    }
                }
                if (survives && (stack.isEmpty() || stack.last() < 0)) {
                    stack.add(ast)
            }
        }
    }

        return stack.toIntArray()
    }
}
class MinStack() {
    var stack = ArrayDeque<Int>()
    var minStack = ArrayDeque<Int>()

    fun push(`val`: Int) {
        stack.addLast(`val`)
        val min = if (minStack.isNotEmpty()) minOf(`val`, minStack.last()) else `val`
        minStack.addLast(min)    }

    fun pop() {
        if (stack.isEmpty()) throw IllegalStateException(\Stack is empty\)
        stack.removeLast()
        minStack.removeLast()
    }

    fun top(): Int {
        if (stack.isEmpty()) throw IllegalStateException(\Stack is empty\)
        return stack.last()    
    }

    fun getMin(): Int {
        return minStack.last()
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */
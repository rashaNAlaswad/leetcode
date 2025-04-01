class MyStack() {
    val queue = ArrayDeque<Int>()

    fun push(x: Int) {
        queue.addLast(x)
        for(i in 0 until queue.size-1){
            queue.addLast(queue.removeFirst())
        }
    }

    fun pop(): Int {
        return queue.removeFirst()
    }

    fun top(): Int {
        return queue.first()        
    }

    fun empty(): Boolean {
        return queue.isEmpty()
    }

}

/**
 * Your MyStack object will be instantiated and called as such:
 * var obj = MyStack()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.empty()
 */
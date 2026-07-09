class MyQueue() {
    val inputStack = ArrayDeque<Int>()
    val outputStack = ArrayDeque<Int>()

    fun push(x: Int) {
        inputStack.addLast(x)
    }

    fun pop(): Int {
        move()
        return outputStack.removeLast()
    }

    fun peek(): Int {
         move()
        return outputStack.last()       
    }

    fun empty(): Boolean {
        return inputStack.isEmpty() && outputStack.isEmpty()
    }

    fun move(){
        if(outputStack.isEmpty()){
            while(!inputStack.isEmpty()){
                outputStack.addLast(inputStack.removeLast())
            }
        }
    }

}

/**
 * Your MyQueue object will be instantiated and called as such:
 * var obj = MyQueue()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */
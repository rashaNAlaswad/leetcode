class StockSpanner() {

    private val stack = ArrayDeque<Pair<Int,Int>>()

    fun next(price: Int): Int {
        var span =1
        while(stack.isNotEmpty() && stack.last().first <= price){
            span+= stack.removeLast().second
        }
        stack.addLast(price to span)
        return span
    }

}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * var obj = StockSpanner()
 * var param_1 = obj.next(price)
 */
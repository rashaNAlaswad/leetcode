class Solution {
    fun generateParenthesis(n: Int): List<String> {
        var res = mutableListOf<String>()
        backtrack(res, StringBuilder() , 0, 0, n)
        return res
    }

    fun backtrack(
        result: MutableList<String>,
        current: StringBuilder,
        open: Int,
        close: Int,
        max: Int
    ){
        if(current.length == 2*max){
            result.add(current.toString())
            return
        }
        if(open < max){
            current.append('(')
            backtrack(result, current, open+1, close, max)
            current.setLength(current.length - 1)
        }
        if(close < open){
            current.append(')')
            backtrack(result, current, open, close+1, max)
            current.setLength(current.length - 1)            
        }
    }
}
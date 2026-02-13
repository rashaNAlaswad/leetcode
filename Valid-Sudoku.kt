1class Solution {
2    fun isValidSudoku(board: Array<CharArray>): Boolean {
3        val seen = mutableSetOf<String>()
4        for(r in 0 until 9){
5            for(c in 0 until 9){
6                val value = board[r][c]
7
8                if(value == '.') continue
9
10                val box = (r/3) * 3 + (c/3)
11
12                val rowkey= "r $r - $value"
13                val colKey = "c $c - $value"
14                val boxKey = "b $box - $value"
15
16                if(!seen.add(rowkey) || !seen.add(colKey) || !seen.add(boxKey)){
17                    return false
18                }
19            }
20        }
21        return true
22    }
23}
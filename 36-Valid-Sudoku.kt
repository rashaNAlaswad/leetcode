class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val row = Array(9) {mutableSetOf<Char>()}
        val column = Array(9) {mutableSetOf<Char>()}
        val boxes = Array(9) {mutableSetOf<Char>()}

        for(i in 0 until 9){
            for(j in 0 until 9){
                if(board[i][j] != '.'){
                    val boxIndex = (i/3) * 3 + (j/3)

                    if(board[i][j] in row[i] || board[i][j] in column[j] || board[i][j] in boxes[boxIndex]){
                        return false
                    }
                    row[i].add(board[i][j])
                    column[j].add(board[i][j])
                    boxes[boxIndex].add(board[i][j])
                    }
                }
            }
        return true
    }
}
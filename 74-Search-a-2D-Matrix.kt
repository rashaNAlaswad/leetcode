class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val rows = matrix.size
        val columns = matrix[0].size

        var start = 0
        var end = (rows * columns) - 1
        while(start <= end){
            val mid = (start + end)/2
            val row = mid/columns
            val col = mid % columns
            var value = matrix[row][col]
            when{
                value == target -> return true
                value > target -> end = mid -1
                else -> start = mid +1
            }
        }
        return false
    }
}
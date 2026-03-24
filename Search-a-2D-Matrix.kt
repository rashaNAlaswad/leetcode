1class Solution {
2    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
3        val rows = matrix.size
4        val cols = matrix[0].size
5
6        var left = 0
7        var right = (rows * cols) -1
8
9        while(left <= right){
10            val mid = (right + left)/2
11
12            val row = mid/cols
13            val col = mid % cols
14            val value = matrix[row][col]
15
16            when{
17                value == target -> return true
18                value < target -> left = mid +1
19                else -> right = mid -1
20            }
21        }
22        return false
23    }
24}
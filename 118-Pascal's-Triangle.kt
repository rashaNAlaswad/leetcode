class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val answer = mutableListOf<List<Int>>()
        for(i in 0..<numRows){
            val row = MutableList(i+1){1}
            for(j in 1..<i){
                row[j] = answer[i-1][j-1] + answer[i-1][j]
            }
            answer.add(row)
        }
        return answer
    }
}
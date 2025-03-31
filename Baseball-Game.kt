class Solution {
    fun calPoints(operations: Array<String>): Int {
        val scores = mutableListOf<Int>()

        for(ope in operations){
            when(ope){
                \+\ -> scores.add(scores[scores.size-1] + scores[scores.size-2])
                \D\ -> scores.add(scores[scores.size-1] * 2)
                \C\ -> scores.removeAt(scores.size-1)
                else -> scores.add(ope.toInt())
            }
        }
        return scores.sum()
    }
}
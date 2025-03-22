class Solution {
    fun findRepeatedDnaSequences(s: String): List<String> {
        if(s.length < 10) return emptyList()

        val result = mutableListOf<String>()
        val sequenceCount = HashMap<String,Int>()

        for(i in 0..s.length-10){
            val sequence = s.substring(i, i+10)
            val count = sequenceCount.getOrDefault(sequence,0) + 1
            sequenceCount[sequence] = count

            if(count == 2) result.add(sequence)
        }

        return result
    }
}
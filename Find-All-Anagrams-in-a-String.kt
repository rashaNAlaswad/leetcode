class Solution {
    fun findAnagrams(s: String, p: String): List<Int> {
        val result = mutableListOf<Int>()
        if(p.length > s.length) return result

        val pCount = IntArray(26)
        val sCount = IntArray(26)

        for(char in p){
            pCount[char - 'a']++
        }
        for(i in 0 until p.length){
            sCount[s[i] - 'a']++
        }

        if(pCount.contentEquals(sCount)){
            result.add(0)
        }

        for(i in p.length until s.length){
            sCount[s[i] - 'a']++
            sCount[s[i-p.length] - 'a']--

            if(pCount.contentEquals(sCount)){
                result.add(i- p.length + 1)
            }   
        }

        return result
    }
}
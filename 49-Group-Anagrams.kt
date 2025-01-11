class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val groups = mutableMapOf<String, MutableList<String>>()

        for(word in strs){
            val anagramKey = word.toCharArray().sorted().joinToString(\\)

            if(!groups.containsKey(anagramKey)){
                groups[anagramKey]= mutableListOf<String>()
            }
        
        groups[anagramKey]!!.add(word)
    }

        return groups.values.toList()
    }
}
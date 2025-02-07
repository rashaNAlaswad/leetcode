class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val words = s.split(" ")
        if(words.size != pattern.length) return false

        val psMap = mutableMapOf<Char,String>()
        val spMap = mutableMapOf<String,Char>() 
        
        for(i in pattern.indices){
            val char = pattern[i]
            val word = words[i]

            if(psMap.containsKey(char)){
                if(psMap[char] != word){
                    return false
                }
            }
            if(spMap.containsKey(word)){
                if(spMap[word] != char){
                    return false
                }
            }

            psMap[char] = word
            spMap[word] = char
        }
        return true
    }
}
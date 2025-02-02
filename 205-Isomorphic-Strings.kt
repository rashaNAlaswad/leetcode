class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        if(s.length != t.length) return false

        val stMap= mutableMapOf<Char,Char>()
        val tsMap= mutableMapOf<Char,Char>()

        for(i in s.indices){
            val sChar = s[i]
            val tChar = t[i]

            if(stMap.containsKey(sChar)){
                if(stMap[sChar] != tChar){
                    return false
                }            
            }
            if(tsMap.containsKey(tChar)){
                if(tsMap[tChar] != sChar){
                    return false
                }            
            }
            stMap[sChar] = tChar
            tsMap[tChar] = sChar

        }
        return true
        
    }
}
class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var result = ""
        strs.minBy{ it.length }?.forEachIndexed { index,char ->
        if(strs.all { it[index] == char } ) result += char 
        else return result
    }    
    return result  
    }
}
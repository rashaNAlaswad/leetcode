class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false

        var hashMap = HashMap<Char, Int>()
        val sArray= s.toCharArray()
        val tArr= t.toCharArray()

        for(char in sArray){
           hashMap[char] = hashMap.getOrDefault(char, 0)+1
        }

        for(char in tArr){
          var count= hashMap.getOrDefault(char, 0)
          if(count < 1) return false

            hashMap[char] = count - 1
        }
        return true
        
    }
}
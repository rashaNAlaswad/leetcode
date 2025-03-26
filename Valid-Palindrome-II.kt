class Solution {
    fun validPalindrome(s: String): Boolean {
       return checkPalindrome(s, 0, s.length-1, false)
    }

    fun checkPalindrome(text: String, left: Int, right:Int, deleted: Boolean) : Boolean{
        var l = left
        var r = right
        while(l < r){

            if(text[l] != text[r]){
                if(deleted) return false
                return checkPalindrome(text, l+1, r, true) || checkPalindrome(text, l, r-1, true)
            }
            l++
            r--
        }
        return true
    }
}
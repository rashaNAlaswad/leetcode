class Solution {
    fun isPalindrome(s: String): Boolean {
        val str = s.lowercase().filter { it.isLetterOrDigit() }
        return str == str.reversed()
    }
}
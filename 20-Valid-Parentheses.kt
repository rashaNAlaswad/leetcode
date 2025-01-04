class Solution {
    fun isValid(s: String): Boolean {
        
    val stack = ArrayDeque<Char>()
    val map = mapOf(')' to '(', '}' to '{', ']' to '[')

    for (char in s) {
        if (char in map.values) {
            stack.add(char)
        } else if (char in map.keys) {
            if (stack.isEmpty() || stack.removeLast() != map[char]) {
                return false
            }
        }
    }

    return stack.isEmpty()
    }
}
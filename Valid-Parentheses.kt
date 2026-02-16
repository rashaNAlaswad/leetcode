1class Solution {
2    fun isValid(s: String): Boolean {
3        
4        val stack = ArrayDeque<Char>()
5        val map = mapOf(')' to '(', ']' to '[', '}' to '{')
6
7        for(char in s){
8            if (char in map.values) {
9                stack.addLast(char)
10            } else{
11                if(stack.isEmpty() || stack.removeLast() != map[char]) return false
12            }
13        }
14        return stack.isEmpty()
15        }
16}
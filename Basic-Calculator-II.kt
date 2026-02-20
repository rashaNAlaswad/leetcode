1class Solution {
2    fun calculate(s: String): Int {
3        val stack = ArrayDeque<Int>()
4        var currentNumber = 0
5        var operation = '+'
6
7        for(i in s.indices){
8            val char = s[i]
9            if(char.isDigit()){
10                currentNumber = currentNumber *10 + char.digitToInt()
11            }
12
13            if((!char.isDigit() && char != ' ') || i == s.length - 1){
14                when(operation){
15                    '+' -> stack.addLast(currentNumber)
16                    '-' -> stack.addLast(-currentNumber)
17                    '*' -> stack.addLast(stack.removeLast() * currentNumber)
18                    '/' -> {
19                        if(currentNumber != 0){
20                            stack.addLast(stack.removeLast() / currentNumber)
21                        }
22                    }
23                }
24                currentNumber = 0
25                operation = char
26            }
27        }
28        return stack.sum()
29    }
30}
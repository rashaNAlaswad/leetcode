1class Solution {
2    fun calculate(s: String): Int {
3        val stack = ArrayDeque<Int>()
4        var result =0
5        var num =0
6        var sign =1
7
8        for(char in s){
9
10            when{
11                char.isDigit() -> {
12                    num = num *10 + char.digitToInt()
13                }
14                char == '+' ->{
15                    result = result + sign * num
16                    num =0
17                    sign = 1
18                }
19                char == '-' ->{
20                    result = result + sign * num
21                    num =0
22                    sign = -1
23                }
24                char == '(' -> {
25                    stack.addLast(result)
26                    stack.addLast(sign)
27                    result = 0
28                    sign = 1
29                }
30                char == ')' -> {
31                    result= result + sign * num
32                    num = 0
33                    result = result * stack.removeLast()
34                    result = result + stack.removeLast()
35                }
36            }
37        }
38        return result + sign * num
39    }
40}
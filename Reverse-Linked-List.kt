1/**
2 * Example:
3 * var li = ListNode(5)
4 * var v = li.`val`
5 * Definition for singly-linked list.
6 * class ListNode(var `val`: Int) {
7 *     var next: ListNode? = null
8 * }
9 */
10class Solution {
11    fun reverseList(head: ListNode?): ListNode? {
12        var prev : ListNode? = null
13
14        var curr =  head
15        while(curr != null){
16            val next = curr.next
17            curr.next = prev
18            prev = curr
19            curr = next
20        }
21        return prev
22    }
23}
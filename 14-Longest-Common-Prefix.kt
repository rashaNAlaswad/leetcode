class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        var prefix = strs[0]

        for (i in 1..<strs.size) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.dropLast(1)
                if (prefix.isEmpty()) return ""
            }
        }
        return prefix 
    }
}
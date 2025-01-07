class Solution {
    fun stringMatching(words: Array<String>): List<String> {
      val sortedList = words.sortedBy { it.length }
    val result = mutableSetOf<String>()
    for (i in sortedList.indices) {
        for (j in i+1..<sortedList.size) {
            if (sortedList[j].contains(sortedList[i])) {
                result.add(sortedList[i])
                break
            }
        }
    }
    return result.toList()      
    }
}
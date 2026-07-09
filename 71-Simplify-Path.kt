class Solution {
    fun simplifyPath(path: String): String {
        val stack = ArrayDeque<String>()
        val part = path.split("/")

        for(str in part){
            when(str){
               ".", "" -> continue
               ".." -> {
                    if(!stack.isEmpty()){
                    stack.removeLast()
                    }
               }
               else -> stack.addLast(str)
            }
        }
        return "/" + stack.joinToString("/")
    }
}
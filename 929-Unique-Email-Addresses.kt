class Solution {
    fun numUniqueEmails(emails: Array<String>): Int {
        val set = mutableSetOf<String>()
        for(email in emails){
            val split = email.split("@")
            val localName = split[0].substringBefore("+").replace(".", "")
            val fullEmail = "$localName@${split[1]}"

            set.add(fullEmail)
        }
        return set.size
    }
}
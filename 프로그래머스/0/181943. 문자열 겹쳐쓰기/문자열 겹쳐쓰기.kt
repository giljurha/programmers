class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var answer: String = ""
        var len1 = my_string.length
        var len2 = overwrite_string.length
        var input1 = my_string.substring(0, s)
        var input2 = my_string.substring((s + len2), len1)

        answer = input1 + overwrite_string + input2
        return answer
    }
}
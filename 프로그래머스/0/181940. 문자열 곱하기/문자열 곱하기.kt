class Solution {
    fun solution(my_string: String, k: Int): String {
        var answer: String = ""
        val stringBuilder = StringBuilder()
        for (i in 0 until k) {
            stringBuilder.append(my_string)
        }
        answer = stringBuilder.toString()
        return answer
    }
}
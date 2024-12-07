class Solution {
    fun solution(arr: Array<String>): String {
        var answer: String = ""
        
        val stringBuilder = StringBuilder()
        for (i in arr) {
            stringBuilder.append(i)
        }
        answer = stringBuilder.toString()
        return answer
    }
}
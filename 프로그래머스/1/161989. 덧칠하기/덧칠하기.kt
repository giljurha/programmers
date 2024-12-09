class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var count = 0 
        var lastPaint = 0 
        for (s in section) {
            if (s > lastPaint) {
                count++
                lastPaint = s + m - 1
            }
        }
        return count
    }
}
package problems.leetcode

class Reverse {

    fun reverseStringRecursive(s: String): String {
        if (s.isEmpty()) {
            return s
        }
        return reverseStringRecursive(s.substring(1)) + s[0]
    }
}

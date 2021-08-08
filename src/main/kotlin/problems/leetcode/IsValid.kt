package problems.leetcode

import java.util.Stack

class IsValid {

    fun isValid(s: String): Boolean {
        val pairs = hashMapOf(
            ')' to '(',
            '}' to '{',
            ']' to '['
        )
        val stack = Stack<Char>()
        s.forEach { char ->
            when (char) {
                ')', '}', ']' -> {
                    if (stack.empty() || stack.peek() != pairs.get(char)) return false
                    stack.pop()
                }
                else -> {
                    stack.push(char)
                }
            }
        }
        return stack.empty()
    }
}

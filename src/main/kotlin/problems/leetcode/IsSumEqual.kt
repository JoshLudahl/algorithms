package problems.leetcode

class IsSumEqual {

    fun isSumEqual(firstWord: String, secondWord: String, targetWord: String): Boolean {
        return (value(firstWord) + value(secondWord)) == value(targetWord)
    }

    fun value(word: String): Int {
        val value = StringBuilder()
        for (char in word) {
            value.append(char - 'a')
        }
        return value.toString().toInt()
    }
}

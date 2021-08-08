package problems.leetcode

class CountMatches {
    fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
        // create a map of the rules and assign their index
        val mapOfRules = mapOf(
            "type" to 0,
            "color" to 1,
            "name" to 2
        )

        // define the count
        var count = 0

        // loop through the items
        for (index in items) {

            // if an item contains the rule value set, increase the counter
            if (index[mapOfRules.getValue(ruleKey)] == ruleValue) {
                count++
            }
        }
        return count
    }
}

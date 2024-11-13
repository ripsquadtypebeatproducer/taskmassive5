fun main() {
    val words = listOf("eat", "tea", "tan", "ate", "nat", "bat")
    val groupedWords = words.groupBy { it.toCharArray().sorted().joinToString("") }

    for (group in groupedWords.values) {
        println(group.joinToString(", "))
    }
}
class AuthorNameNormalizer() {

    fun normalize(name: String): String {
        val suffixSplit = name.trim().split(",")
        require(suffixSplit.count() <= 2) { "Can't handle more than 1 comma" }
        val splitName = suffixSplit.first().split(" ")
        if (splitName.count() == 1) return name
        val suffix = if (suffixSplit.count() > 1) ",${suffixSplit.last()}" else ""
        return "${splitName.last()}, ${splitName.first()}${middleInitials(splitName)}$suffix"
    }

    private fun middleInitials(splitName: List<String>): String {
        val middleNames = splitName.drop(1).dropLast(1)
        return buildString {
            middleNames.forEach { append(initialize(it)) }
        }
    }

    private fun initialize(name: String): String {
        val dot = if (name.count() > 1) "." else ""
        return " ${name.first()}$dot"
    }

}


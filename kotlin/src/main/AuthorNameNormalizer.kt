class AuthorNameNormalizer() {

    fun normalize(name: String): String {
        val splitName = name.trim().split(" ")
        if (splitName.count() == 1) return name
        return "${splitName.last()}, ${splitName.first()}${middleInitials(splitName)}"
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


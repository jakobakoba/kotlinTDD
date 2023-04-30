class AuthorNameNormalizer() {

    fun normalize(name: String): String {
        val prefixSuffix = name.trim().split(",")
        require(prefixSuffix.count() <= 2) { "Can't handle more than 1 comma" }
        val nameParts = prefixSuffix.first().split(" ")
        if (nameParts.count() == 1) return name
        return "${nameParts.last()}, ${nameParts.first()}${middleInitials(nameParts)}${suffix(prefixSuffix)}"
    }

    private fun suffix(prefixSuffix: List<String>): String {
        return if (prefixSuffix.count() == 1) "" else  ",${prefixSuffix.last()}"
    }

    private fun middleInitials(nameParts: List<String>): String {
        val middleNames = nameParts.drop(1).dropLast(1)
        return buildString {
            middleNames.forEach { append(initialize(it)) }
        }
    }

    private fun initialize(name: String): String {
        val dot = if (name.count() > 1) "." else ""
        return " ${name.first()}$dot"
    }

}


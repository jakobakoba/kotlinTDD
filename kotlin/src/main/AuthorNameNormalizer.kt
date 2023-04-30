class AuthorNameNormalizer() {

    fun normalize(name: String): String {
        val splitName = name.trim().split(" ")
        if (splitName.count() == 1) return name
        return "${splitName.last()}, ${splitName.first()}${middleInitial(splitName)}"
    }

    private fun middleInitial(splitName: List<String>): String {
        val middleName = if (splitName.count() >= 3) splitName[1] else ""
        val dot = if (middleName.count() > 1) "." else ""
        return if (middleName.isEmpty()) "" else " ${middleName.first()}$dot"
        }

    }


class AuthorNameNormalizer() {

    fun normalize(name: String): String {
        val splitName = name.trim().split(" ")
        if (splitName.count() == 1) return name

        val middleInitial = middleInitial(splitName)

        return "${splitName.last()}, ${splitName.first()}${middleInitial}"
    }

    private fun middleInitial(splitName: List<String>): String {
        var middleName = ""
        if (splitName.count() >= 3) {
            middleName = splitName[1]
        }
        var middleInitial = ""
        if (!middleName.isEmpty()) {
            middleInitial = " ${middleName.first()}."
        }
        return middleInitial
    }
}

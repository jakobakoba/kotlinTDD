class AuthorNameNormalizer() {

    fun normalize(name: String): String {
        val splitName = name.trim().split(" ")
        if (splitName.count() == 1) return name
        return splitName.last() + ", " + splitName.first()
    }
}

class AuthorNameNormalizer() {

    fun normalize(name: String): String {
        val splitName = name.split(" ")
        if (splitName.count() == 1) return name
        return splitName.last() + ", " + splitName.first()
    }
}

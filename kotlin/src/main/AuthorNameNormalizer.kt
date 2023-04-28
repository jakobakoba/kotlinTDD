class AuthorNameNormalizer() {

    fun normalize(name: String): String {
        val splitName = name.trim().split(" ")

        var middleName = ""
        if (splitName.count() >= 3){
            middleName = splitName[1]
        }
        var middleInitial = ""
        if (!middleName.isEmpty()){
            middleInitial = " " + middleName.first() + "."
        }

        if (splitName.count() == 1) return name
        return "${splitName.last()}, ${splitName.first()}${middleInitial}"
    }
}

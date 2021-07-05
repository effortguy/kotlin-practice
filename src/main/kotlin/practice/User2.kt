package practice

data class User2(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println("""
                Address was chaned for $name: "$field" -> "$value".
            """.trimIndent())
            field = value
        }
}
package practice

class User(
    val id: Int,
    val name: String,
    val address: String
)

fun User.validateBeforeSave() {

    fun validate(value: String, fieldName: String) {

        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user $id: empty $fieldName")
        }
    }

    validate(name, "Name")
    validate(address, "address")
}

fun saveUser(user: User) {
    user.validateBeforeSave()
}
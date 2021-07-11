package practice

class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String)

class Company(val name: String, val address: Address?)

class Customer(val name: String, val company: Company?)

fun Customer.countryName(): String {
    return company?.address?.country ?: "Unknown"
}



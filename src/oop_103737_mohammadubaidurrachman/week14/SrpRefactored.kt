package oop_103737_mohammadubaidurrachman.week14

data class SafeUser(
    val name: String,
    val email: String,
    val age: Int
)

class UserValidator {

    fun validate(user: SafeUser): Boolean {
        return user.email.contains("@") && user.age >= 18
    }
}

class UserRepository {

    fun save(user: SafeUser) {
        println("Saving user ${user.name} to Database")
    }
}
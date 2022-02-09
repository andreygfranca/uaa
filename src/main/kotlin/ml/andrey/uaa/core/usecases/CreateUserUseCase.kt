package ml.andrey.uaa.core.usecases

import ml.andrey.uaa.core.domain.User
import ml.andrey.uaa.core.port.Users

class CreateUserUseCase(
    private val users: Users
) {

    fun createUser(user: User) {
        users.create(user);
    }

}

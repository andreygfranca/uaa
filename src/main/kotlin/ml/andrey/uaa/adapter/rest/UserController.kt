package ml.andrey.uaa.adapter.rest

import ml.andrey.uaa.adapter.rest.UserController.Companion.RESOURCE_PATH
import ml.andrey.uaa.core.port.Users
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(RESOURCE_PATH)
class UserController(private val users: Users) {

    @PostMapping
    fun create(@RequestBody restUser: RestUser) {
        users.create(restUser)
    }

    companion object {
        const val RESOURCE_PATH = "users"
    }

}
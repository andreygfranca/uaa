package ml.andrey.uaa.core.domain

interface AuthorizationConsent {
     val registeredClientId: String

     val principalName: String

     val authorities: String
}
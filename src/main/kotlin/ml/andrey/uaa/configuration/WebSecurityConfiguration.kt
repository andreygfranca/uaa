package ml.andrey.uaa.configuration

import com.nimbusds.jwt.proc.DefaultJWTProcessor
import ml.andrey.uaa.core.port.Users
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder

@Configuration
@EnableWebSecurity
class WebSecurityConfiguration(
    private val users: Users,
    private val passwordEncoder: PasswordEncoder
) : WebSecurityConfigurerAdapter() {

    override fun configure(auth: AuthenticationManagerBuilder) {
        auth.userDetailsService(users)
            .passwordEncoder(passwordEncoder)
    }

    override fun configure(http: HttpSecurity) {
        http.oauth2ResourceServer { oauth2ResourceServerConfigurer ->
            oauth2ResourceServerConfigurer.jwt { jwtConfigurer ->
                jwtConfigurer.decoder(
                    NimbusJwtDecoder(
                        DefaultJWTProcessor()
                    )
                )
            }
        }
    }

}
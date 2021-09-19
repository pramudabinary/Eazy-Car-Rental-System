package lk.ijse.spring.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 9/19/21
 */

@EnableWebSecurity
public class SecurityConfig {
    public void configGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("user").password("password").roles("USER");
        auth.getDefaultUserDetailsService().loadUserByUsername("Pramuda").getPassword().concat("Customer");
    }
}

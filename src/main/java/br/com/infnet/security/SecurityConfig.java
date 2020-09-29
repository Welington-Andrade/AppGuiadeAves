package br.com.infnet.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        	.authorizeRequests()
    			//.antMatchers("/user").permitAll()
        		.antMatchers("/").hasRole("ADMIN")
                    .anyRequest().authenticated().and()
                .csrf().disable()
                .formLogin()
////					.loginPage("/login")
					.defaultSuccessUrl("/home",true)
////                    .permitAll()
//                    .and()
//                .exceptionHandling()
//                    .accessDeniedPage("/acessoadmin")
//                    .and()
//                .logout()
                    .permitAll();
    }

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.inMemoryAuthentication()
				.withUser("user").password("{noop}user00").roles("USER")
				.and()
				.withUser("admin").password("{noop}admin00").roles("ADMIN");
	}

}

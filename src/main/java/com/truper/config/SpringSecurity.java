package com.truper.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringSecurity {
	
	@Bean
	InMemoryUserDetailsManager users() {
		return new InMemoryUserDetailsManager(
				User.withUsername("user").password("{noop}123456").authorities("USER").build(),
				User.withUsername("user2").password("{noop}123456").authorities("USER","ADMIN").build()
			);
	}
	
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) {
		return http
				.csrf(c->c.disable())
				.authorizeHttpRequests(a->a.anyRequest().authenticated())
				.sessionManagement(s->s.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.httpBasic(Customizer.withDefaults())
				.build();
	}

}

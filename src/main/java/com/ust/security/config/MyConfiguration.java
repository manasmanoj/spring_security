package com.ust.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.ust.security.service.MyUserDetailsService;

@Configuration
public class MyConfiguration {
	@Autowired
	private MyUserDetailsService muds;
	@Bean
	public PasswordEncoder passwordEncoder(){
		return NoOpPasswordEncoder.getInstance();
	}
	@Bean
	public DaoAuthenticationProvider authenicationProvider() {
		DaoAuthenticationProvider auth=new DaoAuthenticationProvider();
		auth.setPasswordEncoder(passwordEncoder());
		auth.setUserDetailsService(muds);
		return auth;
	}
}

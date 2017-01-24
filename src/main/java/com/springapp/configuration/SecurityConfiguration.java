package com.springapp.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	/* (non-Javadoc)
	 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.web.builders.HttpSecurity)
	 */
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf().disable();
		
//		httpSecurity
//		.anonymous().and()
//		.authorizeRequests()
//		.antMatchers("/create").permitAll()
//		.antMatchers("/**").authenticated();
		
		httpSecurity
		.anonymous().and()
		.authorizeRequests()
		.antMatchers("/", "/teachers/**", "/students/**", "/grades/**").permitAll()
		.anyRequest().authenticated();
	}
	
}


package com.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.demo.filter.SecurityFilter;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired
	private InvalidUserAuthenticationEntryPoint entryPoint;

	@Autowired
	private SecurityFilter securityFilter;

	@Override
	@Bean
	protected AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}

	/**
	 * Authentication
	 */

	@Override
	protected void configure(AuthenticationManagerBuilder managerBuilder) throws Exception {

		/**
		 * In Memory Authentication
		 */
		// managerBuilder.inMemoryAuthentication().withUser("admin").password(passwordEncoder.encode("admin"))
		// .authorities("ADMIN");
		// managerBuilder.inMemoryAuthentication().withUser("emp").password(passwordEncoder.encode("emp"))
		// .authorities("EMPLOYEE");
		// managerBuilder.inMemoryAuthentication().withUser("stu").password(passwordEncoder.encode("stu"))
		// .authorities("STUDENT");

		managerBuilder.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
	}

	/**
	 * Authorization
	 */

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {

		httpSecurity.csrf().disable().authorizeRequests().antMatchers("/user/save", "/user/login").permitAll()// permitAll
				.anyRequest().authenticated()// any Request Authenticated
				.and().exceptionHandling().authenticationEntryPoint(entryPoint)// Authentication Entry
				.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
				// Register Filter for 2nd Request Onwards
				.addFilterBefore(securityFilter, UsernamePasswordAuthenticationFilter.class);
	}
}

package com.programem.login;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

    
    @EnableWebSecurity
public class SecurityWebConfig extends WebSecurityConfigurerAdapter {
   
  @Override
  protected void configure(AuthenticationManagerBuilder builder) throws Exception {
    builder
        .inMemoryAuthentication()
        .withUser("nicole").password("{noop}nicole")
            .roles("USER")
        .and()
        .withUser("diana").password("{noop}diana")
            .roles("USER")
        .and()
        .withUser("Mika").password("{noop}Mika")
            .roles("USER");

  }
 
}



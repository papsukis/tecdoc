package com.admaroc.tecdoc.security;


import com.admaroc.tecdoc.services.tecdoc.Implementation.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;
    @Autowired
    private DataSource dataSource;
    @Autowired
    private CustomWebAuthenticationDetailsSource authenticationDetailsSource;
    @Autowired
    private CustomAuthenticationProvider authProvider;


    @Bean
    public MySecurityEventListener MySecurityEventListener(){
        return new MySecurityEventListener();
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(final AuthenticationManagerBuilder auth)
            throws Exception {



        auth.authenticationProvider(authProvider);
                //.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.
                authorizeRequests()
                .antMatchers("/", "/login", "/logout").permitAll()
                .antMatchers("/webjars/**").permitAll()
                .antMatchers("/user/").permitAll()
                .antMatchers("/user/**").permitAll()
                .antMatchers("/roles").permitAll()
                .antMatchers("/role").permitAll()
                .antMatchers("/role/**").permitAll()
                .antMatchers("/index").permitAll()
                .antMatchers("/usersPage").hasAuthority("ROLE_USER")
                .antMatchers("/adminPage").hasAuthority("ROLE_ADMIN")
                .antMatchers("/code").permitAll()
                .anyRequest().authenticated().and().csrf().disable().formLogin()
                .and().exceptionHandling().accessDeniedPage("/403")
                .and().formLogin().authenticationDetailsSource(authenticationDetailsSource)//
                .loginProcessingUrl("/j_spring_security_check")
                .loginPage("/login")//
                .defaultSuccessUrl("/index")//
                .failureUrl("/login?error=true")
                .usernameParameter("name")//
                .passwordParameter("password")
                .and().logout().logoutUrl("/logout").logoutSuccessUrl("/logoutSuccessful")
                .and().exceptionHandling();

       http.authorizeRequests().antMatchers("/static/**").permitAll().anyRequest().permitAll();
    }



    @Bean
    @Autowired
    public DaoAuthenticationProvider CustomAuthenticationProvider() {
    final CustomAuthenticationProvider authProvider = new CustomAuthenticationProvider();
    authProvider.setUserDetailsService(userDetailsService);
    authProvider.setPasswordEncoder(bCryptPasswordEncoder());
    return authProvider;
    }
    /*@Bean
    public PersistentTokenRepository persistentTokenRepository() {
        JdbcTokenRepositoryImpl db = new JdbcTokenRepositoryImpl();
        db.setDataSource(dataSource);
        return db;
    }*/


    public SimpleUrlAuthenticationFailureHandler failureHandler() {
        return new SimpleUrlAuthenticationFailureHandler("/login?error=true");
    }

}

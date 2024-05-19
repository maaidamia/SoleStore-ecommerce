package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import java.util.Collection;

@Configuration
@EnableWebSecurity
public class SpringSecurity {

    @Autowired
    private UserDetailsService userDetailsService;

    @Bean
    public static PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(Customizer.withDefaults())
                .authorizeHttpRequests((authorize) ->
                        authorize.requestMatchers("/register/**").permitAll()
                                .requestMatchers("/index", "/").permitAll()
                                .requestMatchers("/admin").hasRole("ADMIN")
                ).formLogin(
                        form -> form
                                .loginPage("/login").permitAll()
                                .loginProcessingUrl("/login")
                                .successHandler((request, response, authentication) -> {
                                    // Retrieve authorities of the authenticated user
                                    Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();

                                    // Check if the user has ADMIN role
                                    boolean isAdmin = authorities.stream()
                                            .anyMatch(authority -> authority.getAuthority().equals("ROLE_ADMIN"));

                                    // Redirect based on user's role
                                    if (isAdmin) {
                                        response.sendRedirect("/admin"); // Redirect admin to adminDashboard
                                    } else {
                                        response.sendRedirect("/index"); // Redirect other users to index
                                    }
                              })
                                .permitAll()
                ).logout(
                        logout -> logout
                                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                                .permitAll()
                );
        return http.build();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder());
}
}
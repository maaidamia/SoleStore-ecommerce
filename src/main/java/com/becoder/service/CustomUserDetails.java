package com.becoder.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class CustomUserDetails implements UserDetails {

    private String userEmail;
    private String userPassword;
    private Collection<? extends GrantedAuthority> authorities;
    private String userName;
    private String userPhone;
    private String userAddress;



    public CustomUserDetails(String userAddress, String userPassword, String userEmail, Collection<? extends GrantedAuthority> authorities, String userName, String userPhone) {
        this.userAddress = userAddress;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.authorities = authorities;
        this.userName = userName;
        this.userPhone = userPhone;
    }

    public String getFullname(){
        return userName;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return userPassword;
    }

    @Override
    public String getUsername() {
        return userEmail;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

package com.becoder.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDto {

    private String userEmail;
    private String userPassword;
    private String userName;
    private String userPhone;
    private String userAddress;


    public UserDto() {
    }

    public UserDto(String userEmail, String userPassword, String userName, String userPhone, String userAddress) {
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userAddress = userAddress;
    }

}

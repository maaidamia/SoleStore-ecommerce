package com.becoder.service;

import com.becoder.dto.UserDto;
import com.becoder.model.User;

public interface UserService {

    User findByUserEmail(String userEmail);
    User save(UserDto userDto);
}

package com.becoder.service;

import com.becoder.dto.UserDto;
import com.becoder.model.User;
import com.becoder.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    PasswordEncoder passwordEncoder;

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User findByUserEmail(String userEmail) {
        return userRepository.findByUserEmail(userEmail);
    }

    @Override
    public User save(UserDto userDto) {
        User user = new User(userDto.getUserEmail(), passwordEncoder.encode(userDto.getUserPassword()), userDto.getUserName(),userDto.getUserPhone(), userDto.getUserAddress());
        return userRepository.save(user) ;
    }
}

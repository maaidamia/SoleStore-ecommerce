package com.group1.shooz.service.serviceimpl;

import com.group1.shooz.model.ManageUser;
import com.group1.shooz.repository.UserRepository;
import com.group1.shooz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<ManageUser> getAllUser(){
        return userRepository.findAll();
    }
}

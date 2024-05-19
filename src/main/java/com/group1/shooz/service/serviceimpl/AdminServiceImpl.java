package com.group1.shooz.service.serviceimpl;

import com.group1.shooz.model.ManageAdmin;
import com.group1.shooz.repository.AdminRepository;
import com.group1.shooz.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepository adminRepository;

    @Override
    public List<ManageAdmin> getAllAdmin(){
        return adminRepository.findAll();
    }
}

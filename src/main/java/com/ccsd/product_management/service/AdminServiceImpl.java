package com.ccsd.product_management.service;

import com.ccsd.product_management.entity.Admin;
import com.ccsd.product_management.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin getAdminById(Integer admin_id) {
        return adminRepository.findById(admin_id).orElse(null);
    }

    @Override
    public void saveAdmin(Admin admin) {
        adminRepository.save(admin);
    }

    @Override
    public void deleteAdmin(Integer admin_id) {
        adminRepository.deleteById(admin_id);
    }

}


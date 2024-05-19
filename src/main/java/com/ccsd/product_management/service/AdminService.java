package com.ccsd.product_management.service;
import com.ccsd.product_management.entity.Admin;

public interface AdminService {
    Admin getAdminById(Integer admin_Id);
    void saveAdmin(Admin admin);
    void deleteAdmin(Integer admin_Id);
}

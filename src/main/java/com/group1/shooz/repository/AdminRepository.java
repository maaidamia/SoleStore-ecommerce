package com.group1.shooz.repository;

import com.group1.shooz.model.ManageAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<ManageAdmin, Long> {
}

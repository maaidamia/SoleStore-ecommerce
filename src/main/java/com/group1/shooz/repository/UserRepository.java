package com.group1.shooz.repository;

import com.group1.shooz.model.ManageUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<ManageUser, Long> {
}

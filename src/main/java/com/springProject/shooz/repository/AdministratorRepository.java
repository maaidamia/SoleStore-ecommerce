package com.springProject.shooz.repository;

import com.springProject.shooz.entity.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministratorRepository  extends JpaRepository<Administrator, Integer> {
}

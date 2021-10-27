package com.example.demo.repository;

import com.example.demo.models.Admin;
import com.example.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {
    public Admin save(Admin user);
    public Admin getAdminByPhoneNumber(Long number);
    public Admin getAdminById(Integer id);
}

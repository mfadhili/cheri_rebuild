package com.example.cheri2.data.repository;

import com.example.cheri2.data.domain.Admin_Home.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
}
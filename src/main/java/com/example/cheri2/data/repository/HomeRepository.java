package com.example.cheri2.data.repository;

import com.example.cheri2.data.domain.Admin_Home.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HomeRepository extends JpaRepository<Home, Long> {
    Optional<Home> getHomeById(Long Id);
}
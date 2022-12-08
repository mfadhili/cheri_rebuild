package com.example.cheri2.data.repository;

import com.example.cheri2.data.domain.child_caregiver.parent.Parents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentsRepository extends JpaRepository<Parents, Long> {
}
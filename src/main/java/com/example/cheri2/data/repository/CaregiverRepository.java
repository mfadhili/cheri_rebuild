package com.example.cheri2.data.repository;

import com.example.cheri2.data.domain.child_caregiver.caregiver.Caregiver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaregiverRepository extends JpaRepository<Caregiver, Long> {
}
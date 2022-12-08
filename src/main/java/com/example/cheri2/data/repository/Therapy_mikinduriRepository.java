package com.example.cheri2.data.repository;

import com.example.cheri2.data.domain.child_caregiver.therapy_attendance.Therapy_mikinduri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Therapy_mikinduriRepository extends JpaRepository<Therapy_mikinduri, Long> {
}
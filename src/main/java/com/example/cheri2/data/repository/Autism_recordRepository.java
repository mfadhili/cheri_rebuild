package com.example.cheri2.data.repository;

import com.example.cheri2.data.domain.child_caregiver.autism_record.Autism_record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Autism_recordRepository extends JpaRepository<Autism_record, Long> {
}
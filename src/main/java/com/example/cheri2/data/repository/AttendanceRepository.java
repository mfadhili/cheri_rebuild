package com.example.cheri2.data.repository;

import com.example.cheri2.data.domain.child_caregiver.daycare_attendance.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
}
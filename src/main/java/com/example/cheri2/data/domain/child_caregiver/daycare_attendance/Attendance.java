package com.example.cheri2.data.domain.child_caregiver.daycare_attendance;

import com.example.cheri2.data.domain.child_caregiver.caregiver.Caregiver;
import com.example.cheri2.data.domain.child_caregiver.child.Children;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "attendance")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    /** Associating the child to the day care attendance*/
    @ManyToOne
    @JoinColumn(name = "children_id")
    private Children children;

    @Enumerated(EnumType.STRING)
    @Column(name = "conditions")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private Conditions conditions;

    @Column(name = "date")
    @JdbcTypeCode(SqlTypes.DATE)
    private LocalDate date;

    @Column(name = "time")
    @JdbcTypeCode(SqlTypes.TIME)
    private LocalTime time;

    /** each attendance field is created by a certain caregiver*/
    @ManyToOne
    @JoinColumn(name = "caregiver_id")
    private Caregiver caregiver;

    public Caregiver getCaregiver() {
        return caregiver;
    }

    public void setCaregiver(Caregiver caregiver) {
        this.caregiver = caregiver;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Conditions getConditions() {
        return conditions;
    }

    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }

    public Children getChildren() {
        return children;
    }

    public void setChildren(Children children) {
        this.children = children;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
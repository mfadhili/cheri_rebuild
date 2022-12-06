package com.example.cheri2.data.models.child;

import jakarta.persistence.*;

@Entity
@Table(name = "children")
public class Children {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
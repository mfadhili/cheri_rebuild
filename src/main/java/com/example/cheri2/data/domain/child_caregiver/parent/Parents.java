package com.example.cheri2.data.domain.child_caregiver.parent;

/**
 * Entity for Parents' record table created.
 * It gives Children's Entity the Parent information.
 * */
import com.example.cheri2.data.domain.child_caregiver.child.Children;
import jakarta.persistence.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Objects;

@Entity
@Table(name = "parents")
public class Parents {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String first_name;

    @Column(name = "last_name")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String last_name;

    @Column(name = "national_id")
    @JdbcTypeCode(SqlTypes.NUMERIC)
    private String national_Id;

    @Column(name = "telephone")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String telephone;

    /** Relationship to children*/
    @ManyToOne
    @JoinColumn(name = "children_id")
    private Children children;

    public Children getChildren() {
        return children;
    }

    public void setChildren(Children children) {
        this.children = children;
    }

    /** Getters and setters*/
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getNational_Id() {
        return national_Id;
    }

    public void setNational_Id(String national_Id) {
        this.national_Id = national_Id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** To string*/
    @Override
    public String toString() {
        return "Parents{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", national_Id='" + national_Id + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Parents parents = (Parents) o;
        return id != null && Objects.equals(id, parents.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
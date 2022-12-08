package com.example.cheri2.data.domain.child_caregiver.autism_record.sub_records;

/**
 * These are Other_items that are part of the autism checklist form
 * They come at the end of the checklist form
 * */
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Objects;

@Embeddable
public class Other_items {
    @Column(name = "comments")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String comments;

    @Column(name = "language_skills")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String language_skills;

    @Column(name = "sensory_processing")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String sensory_processing;

    @Column(name = "social_interactions")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String social_interactions;

    @Column(name = "fine_motor")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String fine_motor;

    @Column(name = "gross_motor")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String gross_motor;

    @Column(name = "activities_of_daily_living")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String activities_of_dailyLiving;

    @Column(name = "general_behaviour")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String general_behaviour;

    @Column(name = "academic_preparedness")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String academic_preparedness;

    @Column(name = "concurring_conditions")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String concurring_conditions;

    /** Getters and setters*/
    public String getConcurring_conditions() {
        return concurring_conditions;
    }

    public void setConcurring_conditions(String concurring_conditions) {
        this.concurring_conditions = concurring_conditions;
    }

    public String getAcademic_preparedness() {
        return academic_preparedness;
    }

    public void setAcademic_preparedness(String academic_preparedness) {
        this.academic_preparedness = academic_preparedness;
    }

    public String getGeneral_behaviour() {
        return general_behaviour;
    }

    public void setGeneral_behaviour(String general_behaviour) {
        this.general_behaviour = general_behaviour;
    }

    public String getActivities_of_dailyLiving() {
        return activities_of_dailyLiving;
    }

    public void setActivities_of_dailyLiving(String activities_of_dailyLiving) {
        this.activities_of_dailyLiving = activities_of_dailyLiving;
    }

    public String getGross_motor() {
        return gross_motor;
    }

    public void setGross_motor(String gross_motor) {
        this.gross_motor = gross_motor;
    }

    public String getFine_motor() {
        return fine_motor;
    }

    public void setFine_motor(String fine_motor) {
        this.fine_motor = fine_motor;
    }

    public String getSocial_interactions() {
        return social_interactions;
    }

    public void setSocial_interactions(String social_interactions) {
        this.social_interactions = social_interactions;
    }

    public String getSensory_processing() {
        return sensory_processing;
    }

    public void setSensory_processing(String sensory_processing) {
        this.sensory_processing = sensory_processing;
    }

    public String getLanguage_skills() {
        return language_skills;
    }

    public void setLanguage_skills(String language_skills) {
        this.language_skills = language_skills;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    /** equal and hash code generated for performance*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Other_items that = (Other_items) o;
        return comments != null && Objects.equals(comments, that.comments)
                && language_skills != null && Objects.equals(language_skills, that.language_skills)
                && sensory_processing != null && Objects.equals(sensory_processing, that.sensory_processing)
                && social_interactions != null && Objects.equals(social_interactions, that.social_interactions)
                && fine_motor != null && Objects.equals(fine_motor, that.fine_motor)
                && gross_motor != null && Objects.equals(gross_motor, that.gross_motor)
                && activities_of_dailyLiving != null && Objects.equals(activities_of_dailyLiving, that.activities_of_dailyLiving)
                && general_behaviour != null && Objects.equals(general_behaviour, that.general_behaviour)
                && academic_preparedness != null && Objects.equals(academic_preparedness, that.academic_preparedness)
                && concurring_conditions != null && Objects.equals(concurring_conditions, that.concurring_conditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comments,
                language_skills,
                sensory_processing,
                social_interactions,
                fine_motor,
                gross_motor,
                activities_of_dailyLiving,
                general_behaviour,
                academic_preparedness,
                concurring_conditions);
    }
}
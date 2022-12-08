package com.example.cheri2.data.domain.child_caregiver.medical_record.subrecords;

/**
 * This is an EMBEDDABLE entity supporting Medical records
 * This section will hold Physique information regarding the medical record
 * The entity will be created in the DB as a separate child linked to the main medical record.
 * * */

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Embeddable
public class Physique {
    @Column(name = "head_circumference")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String head_circumference;

    @Column(name = "hair_col_dist")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String hair_col_dist;

    @Column(name = "observable_features")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String observable_features;

    @Column(name = "body_alignment")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String body_alignment;

    @Column(name = "auditory")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String auditory;

    @Column(name = "olfactory")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String olfactory;

    @Column(name = "gastro")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String gastro;

    @Column(name = "tactile")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String tactile;

    @Column(name = "perceptual")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String perceptual;

    @Column(name = "visual")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String visual;

    @Column(name = "balance")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String balance;

    @Column(name = "scars_deforms")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String scars_deforms;

    @Column(name = "play_leisure")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String play_leisure;

    @Column(name = "other_conditions")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String other_conditions;

    /** Getters and setters*/
    public String getOther_conditions() {
        return other_conditions;
    }

    public void setOther_conditions(String other_conditions) {
        this.other_conditions = other_conditions;
    }

    public String getPlay_leisure() {
        return play_leisure;
    }

    public void setPlay_leisure(String play_leisure) {
        this.play_leisure = play_leisure;
    }

    public String getScars_deforms() {
        return scars_deforms;
    }

    public void setScars_deforms(String scars_deforms) {
        this.scars_deforms = scars_deforms;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getVisual() {
        return visual;
    }

    public void setVisual(String visual) {
        this.visual = visual;
    }

    public String getPerceptual() {
        return perceptual;
    }

    public void setPerceptual(String perceptual) {
        this.perceptual = perceptual;
    }

    public String getTactile() {
        return tactile;
    }

    public void setTactile(String tactile) {
        this.tactile = tactile;
    }

    public String getGastro() {
        return gastro;
    }

    public void setGastro(String gastro) {
        this.gastro = gastro;
    }

    public String getOlfactory() {
        return olfactory;
    }

    public void setOlfactory(String olfactory) {
        this.olfactory = olfactory;
    }

    public String getAuditory() {
        return auditory;
    }

    public void setAuditory(String auditory) {
        this.auditory = auditory;
    }

    public String getBody_alignment() {
        return body_alignment;
    }

    public void setBody_alignment(String body_alignment) {
        this.body_alignment = body_alignment;
    }

    public String getObservable_features() {
        return observable_features;
    }

    public void setObservable_features(String observable_features) {
        this.observable_features = observable_features;
    }

    public String getHair_col_dist() {
        return hair_col_dist;
    }

    public void setHair_col_dist(String hair_col_dist) {
        this.hair_col_dist = hair_col_dist;
    }

    public String getHead_circumference() {
        return head_circumference;
    }

    public void setHead_circumference(String head_circumference) {
        this.head_circumference = head_circumference;
    }


}
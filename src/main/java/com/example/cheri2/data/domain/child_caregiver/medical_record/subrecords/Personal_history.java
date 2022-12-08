package com.example.cheri2.data.domain.child_caregiver.medical_record.subrecords;

/**
 * This is an EMBEDDABLE entity supporting Medical records
 * This section will hold Personal History information regarding the medical record
 * The entity will be created in the DB as a separate child linked to the main medical record.
 * * */

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Embeddable
public class Personal_history {
    @Column(name = "language")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String language;

    @Column(name = "inquiry_referral")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String inquiry_referral;

    @Column(name = "social_status")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String social_status;

    @Column(name = "postnatal_immunisation")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String postnatal_immunisation;

    @Column(name = "chief_complain")
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String chief_complain;

    public String getChief_complain() {
        return chief_complain;
    }

    public void setChief_complain(String chief_complain) {
        this.chief_complain = chief_complain;
    }

    public String getPostnatal_immunisation() {
        return postnatal_immunisation;
    }

    public void setPostnatal_immunisation(String postnatal_immunisation) {
        this.postnatal_immunisation = postnatal_immunisation;
    }

    public String getSocial_status() {
        return social_status;
    }

    public void setSocial_status(String social_status) {
        this.social_status = social_status;
    }

    public String getInquiry_referral() {
        return inquiry_referral;
    }

    public void setInquiry_referral(String inquiry_referral) {
        this.inquiry_referral = inquiry_referral;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
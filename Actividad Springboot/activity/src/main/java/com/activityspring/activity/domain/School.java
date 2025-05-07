package com.activityspring.activity.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class School {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    private City city;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "description_school", length = 50, nullable = false)
    private String descriptionSchool;

    @Column(name = "headmaster_school", length = 50, nullable = false)
    private String headmasterSchool;

    @Column(name = "celphone_school", length = 80, nullable = false)
    private String cellphoneSchool;

    @Column(name = "email_school", length = 80, nullable = false)
    private String emailSchool;

    public School() {
    }

    public School(Integer id, City city, LocalDateTime createdAt, LocalDateTime updatedAt, String descriptionSchool,
            String headmasterSchool, String cellphoneSchool, String emailSchool) {
        this.id = id;
        this.city = city;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.descriptionSchool = descriptionSchool;
        this.headmasterSchool = headmasterSchool;
        this.cellphoneSchool = cellphoneSchool;
        this.emailSchool = emailSchool;
    }

    public Integer getId() {
        return id;
    }

    public City getCity() {
        return city;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public String getDescriptionSchool() {
        return descriptionSchool;
    }

    public String getHeadmasterSchool() {
        return headmasterSchool;
    }

    public String getCellphoneSchool() {
        return cellphoneSchool;
    }

    public String getEmailSchool() {
        return emailSchool;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setDescriptionSchool(String descriptionSchool) {
        this.descriptionSchool = descriptionSchool;
    }

    public void setHeadmasterSchool(String headmasterSchool) {
        this.headmasterSchool = headmasterSchool;
    }

    public void setCellphoneSchool(String cellphoneSchool) {
        this.cellphoneSchool = cellphoneSchool;
    }

    public void setEmailSchool(String emailSchool) {
        this.emailSchool = emailSchool;
    }

}

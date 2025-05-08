package com.activityspring.activity.domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "test_config")
public class TestConfiguration {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "end_date")
    private LocalDate endDate;
    
    @Column(name = "is_active")
    private Boolean isActive;
    
    @Column(name = "score")
    private Integer score;
    
    @Column(name = "start_date")
    private LocalDate startDate;
    
    @Column(name = "description", nullable = false, length = 90)
    private String description;
    
    @Column(name = "test_summary", nullable = false)
    private String testSummary;

    public TestConfiguration() {
    }

    public TestConfiguration(Integer id, LocalDate endDate, Boolean isActive, Integer score, LocalDate startDate,
            String description, String testSummary) {
        this.id = id;
        this.endDate = endDate;
        this.isActive = isActive;
        this.score = score;
        this.startDate = startDate;
        this.description = description;
        this.testSummary = testSummary;
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public Integer getScore() {
        return score;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public String getDescription() {
        return description;
    }

    public String getTestSummary() {
        return testSummary;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTestSummary(String testSummary) {
        this.testSummary = testSummary;
    }

}

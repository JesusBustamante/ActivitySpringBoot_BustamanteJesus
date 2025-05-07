package com.activityspring.activity.domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Exam {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "date_presentation")
    private LocalDate datePresentation;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "testconf_id")
    private TestConfiguration testConfiguration;

    public Exam() {
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getDatePresentation() {
        return datePresentation;
    }

    public Student getStudent() {
        return student;
    }

    public TestConfiguration getTestConfiguration() {
        return testConfiguration;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDatePresentation(LocalDate datePresentation) {
        this.datePresentation = datePresentation;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setTestConfiguration(TestConfiguration testConfiguration) {
        this.testConfiguration = testConfiguration;
    }

    
}

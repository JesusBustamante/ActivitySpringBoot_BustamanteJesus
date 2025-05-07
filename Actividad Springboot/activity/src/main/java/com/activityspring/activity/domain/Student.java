package com.activityspring.activity.domain;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer age;

    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    private City city;

    @ManyToOne
    @JoinColumn(name = "school_id", nullable = false)
    private School school;

    @Column(length = 30, nullable = false)
    private String celphone;

    @Column(length = 50, nullable = false)
    private String email;

    @Column(length = 50, nullable = false)
    private String firstname;

    @Column(length = 50, nullable = false)
    private String lastname;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Exam> exams;

    public Student() {
    }

    public Student(Integer id, Integer age, City city, School school, String celphone, String email, String firstname,
            String lastname, List<Exam> exams) {
        this.id = id;
        this.age = age;
        this.city = city;
        this.school = school;
        this.celphone = celphone;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.exams = exams;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public City getCity() {
        return city;
    }

    public School getSchool() {
        return school;
    }

    public String getCelphone() {
        return celphone;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public List<Exam> getExams() {
        return exams;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void setCelphone(String celphone) {
        this.celphone = celphone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setExams(List<Exam> exams) {
        this.exams = exams;
    }

}

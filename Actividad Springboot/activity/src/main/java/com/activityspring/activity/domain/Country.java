package com.activityspring.activity.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "country_name", length = 50)
    private String countryName;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<State> states = new ArrayList<>();

    public Country() {
    }

    public Country(Integer id, LocalDateTime createdAt, LocalDateTime updatedAt, String countryName,
            List<State> states) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.countryName = countryName;
        this.states = states;
    }

    public Integer getId() {
        return id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public String getCountryName() {
        return countryName;
    }

    public List<State> getStates() {
        return states;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }

}

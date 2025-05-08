package com.activityspring.activity.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cities")
public class City {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "state_id", nullable = false)
    private State state;

    @Column(name = "state_abbreviation", length = 6)
    private String stateAbbreviation;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "name_city", length = 50, nullable = false)
    private String nameCity;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<School> schools = new ArrayList<>();

    public City() {
    }

    public City(Integer id, State state, String stateAbbreviation, LocalDateTime createdAt, LocalDateTime updatedAt,
            String nameCity, List<School> schools) {
        this.id = id;
        this.state = state;
        this.stateAbbreviation = stateAbbreviation;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.nameCity = nameCity;
        this.schools = schools;
    }

    public Integer getId() {
        return id;
    }

    public State getState() {
        return state;
    }

    public String getStateAbbreviation() {
        return stateAbbreviation;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public String getNameCity() {
        return nameCity;
    }

    public List<School> getSchools() {
        return schools;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setStateAbbreviation(String stateAbbreviation) {
        this.stateAbbreviation = stateAbbreviation;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public void setSchools(List<School> schools) {
        this.schools = schools;
    }

    
}

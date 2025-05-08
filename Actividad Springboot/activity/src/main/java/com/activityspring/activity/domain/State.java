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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "states")
public class State {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "abbreviation", length = 50, nullable = false)
    private String abbreviation;

    @Column(name = "name_state", length = 50, nullable = false)
    private String nameState;

    @OneToMany(mappedBy = "state", cascade = CascadeType.ALL)
    private List<City> cities = new ArrayList<>();

    public State() {
    }

    public State(Integer id, Country country, LocalDateTime createdAt, LocalDateTime updatedAt, String abbreviation,
            String nameState, List<City> cities) {
        this.id = id;
        this.country = country;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.abbreviation = abbreviation;
        this.nameState = nameState;
        this.cities = cities;
    }

    public Integer getId() {
        return id;
    }

    public Country getCountry() {
        return country;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getNameState() {
        return nameState;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public void setNameState(String nameState) {
        this.nameState = nameState;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

}

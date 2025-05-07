package com.activityspring.activity.domain;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Question {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "score", nullable = false)
    private Integer score;
    
    @ManyToOne
    @JoinColumn(name = "typeoption_id")
    private TypeOption typeOption;
    
    @Column(name = "description", nullable = false, length = 80)
    private String description;

    public Question() {
    }

    public Question(Integer id, Integer score, TypeOption typeOption, String description) {
        this.id = id;
        this.score = score;
        this.typeOption = typeOption;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public Integer getScore() {
        return score;
    }

    public TypeOption getTypeOption() {
        return typeOption;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void setTypeOption(TypeOption typeOption) {
        this.typeOption = typeOption;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

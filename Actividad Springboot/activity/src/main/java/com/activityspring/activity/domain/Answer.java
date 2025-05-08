package com.activityspring.activity.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "answers")
public class Answer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "is_correct", nullable = false)
    private Boolean isCorrect;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "description", nullable = false, length = 80)
    private String description;

    public Answer() {
    }

    public Answer(Integer id, Boolean isCorrect, Question question, LocalDateTime createdAt, LocalDateTime updatedAt,
            String description) {
        this.id = id;
        this.isCorrect = isCorrect;
        this.question = question;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public Boolean getIsCorrect() {
        return isCorrect;
    }

    public Question getQuestion() {
        return question;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setIsCorrect(Boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

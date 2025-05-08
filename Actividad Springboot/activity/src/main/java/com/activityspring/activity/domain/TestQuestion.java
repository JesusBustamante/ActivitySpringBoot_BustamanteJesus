package com.activityspring.activity.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "test_questions")
public class TestQuestion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
    
    @ManyToOne
    @JoinColumn(name = "testconfig_id")
    private TestConfiguration testConfiguration;

    public TestQuestion() {
    }

    public TestQuestion(Integer id, Question question, TestConfiguration testConfiguration) {
        this.id = id;
        this.question = question;
        this.testConfiguration = testConfiguration;
    }

    public Integer getId() {
        return id;
    }

    public Question getQuestion() {
        return question;
    }

    public TestConfiguration getTestConfiguration() {
        return testConfiguration;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public void setTestConfiguration(TestConfiguration testConfiguration) {
        this.testConfiguration = testConfiguration;
    }

}

package com.activityspring.activity.domain;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class TypeOption {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "description", nullable = false, length = 80)
    private String description;

    @Column(name = "tag_option", nullable = false, length = 80)
    private String tagOption;

    public TypeOption() {
    }

    public TypeOption(Long id, String description, String tagOption) {
        this.id = id;
        this.description = description;
        this.tagOption = tagOption;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getTagOption() {
        return tagOption;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTagOption(String tagOption) {
        this.tagOption = tagOption;
    }

}

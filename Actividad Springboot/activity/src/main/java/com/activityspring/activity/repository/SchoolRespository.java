package com.activityspring.activity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.activityspring.activity.domain.School;

public interface SchoolRespository extends JpaRepository<School, Long>{
    List<School> findByDescriptionSchoolContains(String description);
    List<School> findByHeadmasterSchoolContains(String headmaster);
    List<School> findByCityId(Integer cityId);
}

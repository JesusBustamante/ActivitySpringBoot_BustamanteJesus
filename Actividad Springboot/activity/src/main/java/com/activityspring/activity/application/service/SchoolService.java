package com.activityspring.activity.application.service;

import java.util.List;

import com.activityspring.activity.domain.School;

public interface SchoolService {
    List<School> findAllSchools();
    List<School> findSchoolsByFilter(String filter, String value);
}

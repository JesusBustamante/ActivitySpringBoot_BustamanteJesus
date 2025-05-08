package com.activityspring.activity.repository;

import java.util.List;

import org.springframework.stereotype.Service;

import com.activityspring.activity.application.service.SchoolService;
import com.activityspring.activity.domain.School;

@Service
public class SchoolServiceImpl implements SchoolService {
    
    private final SchoolRespository schoolRespository;

    public SchoolServiceImpl(SchoolRespository schoolRespository) {
        this.schoolRespository = schoolRespository;
    }

    @Override
    public List<School> findAllSchools() {
        return schoolRespository.findAll();
    }

    @Override
    public List<School> findSchoolsByFilter(String filter, String value) {
        if(value == null || value.isEmpty()) {
            return findAllSchools();
        }
        
        if(filter == null) {
            return findAllSchools();
        }

        switch(filter.toLowerCase()) {
            case "description_school":
                return schoolRespository.findByDescriptionSchoolContains(value);
            case "headmaster_school":
                return schoolRespository.findByHeadmasterSchoolContains(value);
            case "city":
                try {
                    return schoolRespository.findByCityId(Integer.parseInt(value));
                } catch (NumberFormatException e) {
                    return findAllSchools();
                }
            default:
                return findAllSchools();
        }
    }
}
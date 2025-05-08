package com.activityspring.activity.infraestructure.controller;

import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.activityspring.activity.application.service.SchoolService;
import com.activityspring.activity.domain.School;


@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class SchoolController {
    
    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @GetMapping("/schools")
    public ResponseEntity<List<School>> getAllSchools(
        @RequestParam(name = "filter", required = false) String filter,
        @RequestParam(name = "value", required = false) String value) {
        
        if(filter != null && value != null) {
            return ResponseEntity.ok(schoolService.findSchoolsByFilter(filter, value));
        }
        return ResponseEntity.ok(schoolService.findAllSchools());
    }

}

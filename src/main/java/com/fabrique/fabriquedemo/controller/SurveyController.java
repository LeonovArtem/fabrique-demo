package com.fabrique.fabriquedemo.controller;

import com.fabrique.fabriquedemo.entity.Survey;
import com.fabrique.fabriquedemo.service.SurveyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("survey")
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    @GetMapping
    private List<Survey> list() {
        return surveyService.getAll();
    }

    @GetMapping("{id}")
    public Survey getOne(@PathVariable("id") Survey survey) {
        return survey;
    }

    @PostMapping
    public Survey create(@RequestBody Survey survey) {
        return surveyService.save(survey);
    }

    @PutMapping("{id}")
    public Survey update(
            @PathVariable("id") Survey surveyFromDb,
            @RequestBody Survey survey
    ) {
        BeanUtils.copyProperties(survey, surveyFromDb, "id");

        return surveyService.save(surveyFromDb);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Survey survey) {
        surveyService.delete(survey);
    }
}

package com.fabrique.fabriquedemo.service;

import com.fabrique.fabriquedemo.entity.Survey;

import java.util.List;

public interface SurveyService {

    List<Survey> getAll();

    Survey save(Survey survey);

    void delete(Survey survey);
}

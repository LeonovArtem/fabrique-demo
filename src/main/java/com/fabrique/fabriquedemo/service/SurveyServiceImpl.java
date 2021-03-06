package com.fabrique.fabriquedemo.service;

import com.fabrique.fabriquedemo.entity.Survey;
import com.fabrique.fabriquedemo.exception.NotFoundException;
import com.fabrique.fabriquedemo.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyServiceImpl implements SurveyService {

    @Autowired
    private SurveyRepository surveyRepository;

    public List<Survey> getAll() {
        return surveyRepository.findAll();
    }

    public Survey save(Survey survey) {
        return surveyRepository.save(survey);
    }

    public void delete(Survey survey) {
        surveyRepository.delete(survey);
    }

    @Override
    public Survey findById(long id) throws NotFoundException {
        return surveyRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    public List<Survey> getAllWithQuestion() {
        return surveyRepository.findAll();
    }
}

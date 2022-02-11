package com.fabrique.fabriquedemo.service;

import com.fabrique.fabriquedemo.entity.Question;
import com.fabrique.fabriquedemo.exception.NotFoundException;

import java.util.List;

public interface QuestionService {

    List<Question> getAll();

    Question save(Question question);

    void delete(Question question);

    Question findById(long id) throws NotFoundException;
}

package com.fabrique.fabriquedemo.service;

import com.fabrique.fabriquedemo.entity.Question;
import com.fabrique.fabriquedemo.exception.NotFoundException;
import com.fabrique.fabriquedemo.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> getAll() {
        return questionRepository.findAll();
    }

    public Question save(Question question) {
        return questionRepository.save(question);
    }

    public void delete(Question question) {
        questionRepository.delete(question);
    }

    @Override
    public Question findById(long id) throws NotFoundException {
        return questionRepository.findById(id).orElseThrow(NotFoundException::new);
    }
}

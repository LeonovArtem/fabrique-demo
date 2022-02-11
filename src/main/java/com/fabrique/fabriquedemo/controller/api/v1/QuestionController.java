package com.fabrique.fabriquedemo.controller.api.v1;

import com.fabrique.fabriquedemo.Dto.FilterDto;
import com.fabrique.fabriquedemo.entity.Question;
import com.fabrique.fabriquedemo.service.QuestionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping
    private List<Question> list(
            @RequestParam(required = false, name = "filter") FilterDto filter,
            @RequestParam(required = false, name = "range") String rangeStr,
            @RequestParam(required = false, name = "sort") String sortStr
    ) {
        return questionService.getAll();
    }

    @GetMapping("{id}")
    public Question getOne(@PathVariable("id") Question question) {
        return question;
    }

    @PostMapping
    public Question create(@RequestBody Question question) {
        return questionService.save(question);
    }

    @PutMapping("{id}")
    public Question update(
            @PathVariable("id") Question questionFromDb,
            @RequestBody Question question
    ) {
        BeanUtils.copyProperties(question, questionFromDb, "id");

        return questionService.save(questionFromDb);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") long id) {
        Question question = questionService.findById(id);

        questionService.delete(question);
    }
}

package com.fabrique.fabriquedemo.controller.web;

import com.fabrique.fabriquedemo.Dto.AnswerDto;
import com.fabrique.fabriquedemo.entity.User;
import com.fabrique.fabriquedemo.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    SurveyService surveyService;

    @GetMapping()
    public String index(Model model) {
        List<AnswerDto> answers = new ArrayList<>();
        model.addAttribute("surveys", surveyService.getAllWithQuestion());
        model.addAttribute("user", new User());
        model.addAttribute("answers", answers);

        return "user/index";
    }

    @PostMapping
    public void save(Model model){
        // todo: do it
    }
}

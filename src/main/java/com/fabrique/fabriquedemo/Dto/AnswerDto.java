package com.fabrique.fabriquedemo.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AnswerDto {

    public int questionId;

    public String userAnswer;
}

package com.ryan.WWTBAM.question.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDto {
    private int id;
    private String question;
    private boolean isCorrect;

}

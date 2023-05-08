package com.ryan.WWTBAM.question.models.views;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuestionViewModel {
    private int id;
    private String question;
    private boolean isCorrect;
}

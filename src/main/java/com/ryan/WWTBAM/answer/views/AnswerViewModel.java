package com.ryan.WWTBAM.answer.views;

import com.ryan.WWTBAM.db.entity.Question;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AnswerViewModel {
    private Long id;
    private String answer;
    private boolean isCorrect;
}

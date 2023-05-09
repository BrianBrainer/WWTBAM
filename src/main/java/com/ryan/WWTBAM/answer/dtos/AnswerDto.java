package com.ryan.WWTBAM.answer.dtos;

import com.ryan.WWTBAM.db.entity.Question;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AnswerDto {

    private Long id;
    private String answer;
    private boolean isCorrect;

}

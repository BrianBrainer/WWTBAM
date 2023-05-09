package com.ryan.WWTBAM.question.dtos;

import com.ryan.WWTBAM.db.entity.Answer;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDto {
    private Long id;
    private String question;
    private List<Answer> answer;
}

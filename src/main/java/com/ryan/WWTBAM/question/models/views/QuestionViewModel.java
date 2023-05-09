package com.ryan.WWTBAM.question.models.views;

import com.ryan.WWTBAM.db.entity.Answer;
import java.util.List;
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
    private List<Answer> answer;
}

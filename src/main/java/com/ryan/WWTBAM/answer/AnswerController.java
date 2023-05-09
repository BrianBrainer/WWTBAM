package com.ryan.WWTBAM.answer;

import com.ryan.WWTBAM.answer.dtos.AnswerDto;
import com.ryan.WWTBAM.answer.views.AnswerViewModel;
import com.ryan.WWTBAM.utils.mapper.Mapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AnswerController {

    private final Mapper mapper;
    private final AnswerService answerService;

    @GetMapping("/answer/{questionId}") // maybe change to /{questionId}/answers
    public AnswerViewModel getAnswersByQuestionId(@PathVariable int questionId)
    {
        AnswerDto answers = answerService.getAnswersByQuestionId(questionId);

        return mapper.map(answers, AnswerViewModel.class);
    }

}

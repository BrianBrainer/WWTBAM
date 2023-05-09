package com.ryan.WWTBAM.question;

import com.ryan.WWTBAM.question.dtos.QuestionDto;
import com.ryan.WWTBAM.question.models.views.QuestionViewModel;
import com.ryan.WWTBAM.utils.mapper.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins="*", allowedHeaders = "*")
public class QuestionController {
    private final Mapper mapper;
    private final QuestionService questionService;

    @GetMapping("/question/{difficultyLevel}")
    public QuestionViewModel getQuestion(@PathVariable int difficultyLevel)
    {

        QuestionDto question = questionService.getQuestionByDifficultyLevel(difficultyLevel);

        return mapper.map(question, QuestionViewModel.class);

    }

}

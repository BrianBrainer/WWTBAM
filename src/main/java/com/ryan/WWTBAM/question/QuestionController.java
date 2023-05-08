package com.ryan.WWTBAM.question;

import com.ryan.WWTBAM.db.QuestionRepository;
import com.ryan.WWTBAM.db.entity.Question;
import java.util.List;
import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

    private final QuestionRepository questionRepository;

    public QuestionController(QuestionRepository questionRepository)
    {
        this.questionRepository = questionRepository;
    }

    @GetMapping("/question/{difficultyLevel}")
    public Question getQuestion(@PathVariable int difficultyLevel)
    {

        List<Question> potentialQuestions = questionRepository.findAllByDifficultyLevel(difficultyLevel);

        return potentialQuestions.get(new Random().nextInt(potentialQuestions.size()));

    }

}

package com.ryan.WWTBAM.question;

import com.ryan.WWTBAM.db.QuestionRepository;
import com.ryan.WWTBAM.db.entity.Question;
import com.ryan.WWTBAM.question.dtos.QuestionDto;
import com.ryan.WWTBAM.utils.mapper.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class QuestionService {
    private final Mapper mapper;
    private final QuestionRepository questionRepository;

    public QuestionDto getQuestionByDifficultyLevel(int difficultyLevel){
        List<Question> potentialQuestions = questionRepository.findAllByDifficultyLevel(difficultyLevel);

        return mapper.map(potentialQuestions.get(new Random().nextInt(potentialQuestions.size())), QuestionDto.class);
    }


}

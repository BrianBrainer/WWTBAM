package com.ryan.WWTBAM.answer;

import com.ryan.WWTBAM.answer.dtos.AnswerDto;
import com.ryan.WWTBAM.db.AnswerRepository;
import com.ryan.WWTBAM.db.entity.Answer;
import com.ryan.WWTBAM.utils.mapper.Mapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AnswerService {

    private final Mapper mapper;
    private final AnswerRepository answerRepository;

    @Transactional
    public AnswerDto getAnswersByQuestionId(int questionId)
    {
        List<Answer> answers = answerRepository.findAnswersByQuestionId(questionId);

        Answer correctAnswer = answers.stream()
            .filter(Answer::isCorrect)
            .findFirst()
            .orElse(null);

        return mapper.map(correctAnswer, AnswerDto.class);

    }
}

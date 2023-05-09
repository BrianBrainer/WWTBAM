package com.ryan.WWTBAM.db;

import com.ryan.WWTBAM.db.entity.Answer;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface AnswerRepository extends CrudRepository<Answer, Integer> {

    List<Answer> findAnswersByQuestionId(int questionId);
}

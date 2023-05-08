package com.ryan.WWTBAM.db;

import com.ryan.WWTBAM.db.entity.Question;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question, Integer> {

    List<Question> findAllByDifficultyLevel(int difficultyLevel);
}

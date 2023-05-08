INSERT INTO question (question, difficulty_level)
VALUES ('What colour is a firetruck?', 1);

INSERT INTO answer (answer, is_correct, question_id)
VALUES ('Red', true, 1);

INSERT INTO answer (answer, is_correct, question_id)
VALUES ('Yellow', false, 1);

INSERT INTO answer (answer, is_correct, question_id)
VALUES ('Blue', false, 1);

INSERT INTO answer (answer, is_correct, question_id)
VALUES ('Green', false, 1);

INSERT INTO lifeline (name, used)
VALUES ('Ask the audience', false);

INSERT INTO lifeline (name, used)
VALUES ('Phone a fried', false);

INSERT INTO lifeline (name, used)
VALUES ('50/50', false);
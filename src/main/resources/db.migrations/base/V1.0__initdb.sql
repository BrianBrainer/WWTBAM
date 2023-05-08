create table question (
                          id serial constraint PK_question_id primary key,
                          difficulty_level integer not null,
                          question varchar(255) not null
);

create table answer (
                        id serial constraint PK_answer_id primary key,
                        answer varchar(255) not null,
                        is_correct boolean not null,
                        question_id int not null,
                        CONSTRAINT FK_answer_question_id
                            FOREIGN KEY (question_id)
                                    REFERENCES question (id)
                    );

create table lifeline (
                        id serial constraint PK_lifeline_id primary key,
                        name varchar(255) not null,
                        used boolean not null
                      );


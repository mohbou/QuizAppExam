package com.quizappexam.app.quizappexam.data.database;

import com.quizappexam.app.quizappexam.model.entity.Answer;
import com.quizappexam.app.quizappexam.model.entity.Question;

import java.util.List;

public final class DatabaseImpl implements Database {

private static DatabaseImpl DBInstance;

    private DatabaseImpl() {
    }


    public static DatabaseImpl getDBInstance() {
       return DatabaseImpl.DBInstance == null ? DatabaseImpl.DBInstance =  new DatabaseImpl(): DatabaseImpl.DBInstance;
    }

    @Override
    public List<Question> loadQuestion() {
        return null;
    }

    @Override
    public Question getQuestionById(int Id) {
        return null;
    }

    @Override
    public List<Answer> getAnswersNyId(int QuestionId) {
        return null;
    }


}

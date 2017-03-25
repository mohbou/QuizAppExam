package com.quizappexam.app.quizappexam.data.database;

import com.quizappexam.app.quizappexam.model.entity.Answer;
import com.quizappexam.app.quizappexam.model.entity.Question;

import java.util.List;

public interface Database {
    public List<Question> loadQuestion();
    public Question getQuestionById(int Id);
    public List<Answer> getAnswersNyId(int QuestionId);
}

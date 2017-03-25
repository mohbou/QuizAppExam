package com.quizappexam.app.quizappexam.data.database;

import com.quizappexam.app.quizappexam.model.entity.Answer;
import com.quizappexam.app.quizappexam.model.entity.Question;

import java.util.ArrayList;
import java.util.List;

public final class DatabaseImpl implements Database {

private static DatabaseImpl DBInstance;
    private List<Question> mQuestions;
    private List<Answer> mAnswers;
    private DatabaseImpl() {
        initDummyQuestions();
    }


    public static DatabaseImpl getDBInstance() {
       return DatabaseImpl.DBInstance == null ? DatabaseImpl.DBInstance =  new DatabaseImpl(): DatabaseImpl.DBInstance;
    }

    @Override
    public List<Question> loadQuestion() {
        return mQuestions;
    }

    @Override
    public Question getQuestionById(int id) {
        return mQuestions.get(id);
    }

    @Override
    public List<Answer> getAnswersNyId(int QuestionId) {
        return null;
    }

    private void initDummyQuestions() {

        mQuestions = new ArrayList<>();

        for(int i=0;i<20;i++) {
            Question question = new Question();
            mAnswers = new ArrayList<>();
            question.setQuestion("This is a dummy Question number "+i);

            for(int j=0;j<4;j++) {
                Answer answer =  new Answer();
                answer.setAnswerID(j);
                answer.setAnswerString("Dummy Answer number "+j);
                answer.setAnswerValid(true);
                mAnswers.add(answer);
            }
            question.setAnswerList(mAnswers);
            mQuestions.add(question);

        }
    }


}

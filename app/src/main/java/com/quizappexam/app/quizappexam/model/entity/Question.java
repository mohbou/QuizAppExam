package com.quizappexam.app.quizappexam.model.entity;

import java.util.List;

public class Question {

    private int questionId;
    private String question;
    private List<Answer> answerList;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }

    private String mStatement;
    private int mAnswerIndex;
    private List<String> mOptions;

    public List<String> getOptions() {
        return mOptions;
    }

    public void setOptions(List<String> options) {
        mOptions = options;
    }

    public Question() {

    }

    public void setStatement(String mStatement) {
        this.mStatement = mStatement;
    }
    public String getStatement() {
        return mStatement;
    }





    public int getAnswerIndex() {
        return mAnswerIndex;
    }

    public void setAnswerIndex(int answerIndex) {
        mAnswerIndex = answerIndex;
    }
}

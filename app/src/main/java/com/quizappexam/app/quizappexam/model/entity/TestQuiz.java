package com.quizappexam.app.quizappexam.model.entity;

import java.util.List;

public class TestQuiz {


    private List<Question> mQuestions;

    private int mStatus;
    public final static int TEST_STARTED=0;
    public final static int TEST_CANCELED=1;
    public final static int TEST_COMPLETED=2;

    private int currentQuestionIndex= -1;

    public Question getQuestion(int index) {
        return QuestionBank.getBank().getQuestion(index);
    }


    public int getCurrentQuestionIndex() {
        return currentQuestionIndex;
    }


    public List<Question> getQuestions() {
        return mQuestions;
    }


    public int getStatus() {
        return mStatus;
    }

    public void setStatus(int status) {

        mStatus = status;
    }

    public boolean selectAnswer(int pickAnswer,int questionIndex) {
        if(pickAnswer==getQuestion(questionIndex).getAnswerIndex())
            return true;
        return false;
    }

    public void loadQuestions() {
        mQuestions =QuestionBank.getBank().loadQuestions();
    }


    public void pickedAnswer(int answerPicked) {
        mQuestions.get(currentQuestionIndex).setAnswerIndex(answerPicked);

    }
}

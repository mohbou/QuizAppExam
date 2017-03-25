package com.quizappexam.app.quizappexam.model.entity;

public class Answer {

    private int AnswerID;
    private String answerString;
    private boolean answerValid;

    public int getAnswerID() {
        return AnswerID;
    }

    public void setAnswerID(int answerID) {
        AnswerID = answerID;
    }

    public String getAnswerString() {
        return answerString;
    }

    public void setAnswerString(String answerString) {
        this.answerString = answerString;
    }

    public boolean isAnswerValid() {
        return answerValid;
    }

    public void setAnswerValid(boolean answerValid) {
        this.answerValid = answerValid;
    }
}

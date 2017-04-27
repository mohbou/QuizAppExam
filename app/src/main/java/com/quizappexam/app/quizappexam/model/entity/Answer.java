package com.quizappexam.app.quizappexam.model.entity;

public class Answer {

    private int answerID;
    private String answerString;
    private boolean answerValid;

    public int getAnswerID() {
        return answerID;
    }

    public void setAnswerID(int answerID) {
        this.answerID = answerID;
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

package com.quizappexam.app.quizappexam.model.entity;

import java.util.ArrayList;
import java.util.List;

public  class QuestionBank {
    private List<Question> mQuestionList = new ArrayList<>();


    private static QuestionBank sQuestionBank;

    public static QuestionBank getBank() {
        if(sQuestionBank==null)
            sQuestionBank = new QuestionBank();

        return sQuestionBank;

    }
    private  QuestionBank() {
    }

    public List<Question> getQuestionList() {
        return mQuestionList;
    }

    public Question getQuestion(int index) {
        if(index<mQuestionList.size())
            return mQuestionList.get(index);
        else
            return new Question();
    }


    public  List<Question> loadQuestions() {
        for (int i = 0; i < 3; i++) {
            Question question = new Question();
            question.setStatement("question 1");
          //  question.setOptions(Arrays.asList("Option 1","Option 2","Option 3", "Option 4"));
            mQuestionList.add(question);
        }

        return mQuestionList;
    }
}

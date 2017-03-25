package com.quizappexam.app.quizappexam.model.entity;

import com.quizappexam.app.quizappexam.model.entity.Question;
import com.quizappexam.app.quizappexam.model.entity.TestQuiz;
import com.quizappexam.app.quizappexam.model.entity.User;

public class QuizSystem {

    private User mUser;
    private TestQuiz mTestQuiz;

    public QuizSystem(User user) {
        this.mUser =user;
    }

    public User getUser() {
        return mUser;
    }




    public TestQuiz startTest() {

        mTestQuiz = new TestQuiz();
       return mTestQuiz;
    }

    public Question displayQuestion(int index) {
        return null;
    }



    public  void cancelTest() {
        if(mTestQuiz!=null) mTestQuiz.setStatus(1);

    }
}

package com.quizappexam.app.quizappexam.test;


import com.quizappexam.app.quizappexam.model.entity.QuizSystem;

import com.quizappexam.app.quizappexam.model.entity.TestQuiz;
import com.quizappexam.app.quizappexam.model.entity.User;

import org.junit.Ignore;
import org.junit.Test;


import static org.junit.Assert.*;

public class MainActivityTest {
    @Ignore
    @Test
    public void testShouldDisplayOneQuestionWhenUserStartTest() {

        //Given
        User user = new User();
        QuizSystem mQuizSystem =new QuizSystem(user);

        //when
        TestQuiz test= mQuizSystem.startTest();
        test.loadQuestions();
        String statement = mQuizSystem.displayQuestion(2).getStatement();
        //then
        assertEquals("question 1",statement);

    }
    @Ignore
    @Test
    public void userShouldSucceedToRespondToOneQuestion() {

        //Given
        User user = new User();
        QuizSystem mQuizSystem =new QuizSystem(user);
        TestQuiz test= mQuizSystem.startTest();
        test.loadQuestions();

        //When
        int pickAnswer = 2;
        int questionNUmber = 0;
        boolean answerVerified = test.selectAnswer(pickAnswer, questionNUmber);

        //then
        assertEquals(true,answerVerified);
    }





    //user start test, leave without completing the test.
    @Ignore
    @Test
    public void userShouldStartTestThanCancelTest() {

        //Given
        User user = new User();
        QuizSystem mQuizSystem =new QuizSystem(user);
        TestQuiz test= mQuizSystem.startTest();
        test.loadQuestions();

        //When
        mQuizSystem.cancelTest();

        //Then
        assertEquals(TestQuiz.TEST_CANCELED,test.getStatus());

    }
    @Ignore
    @Test
    public void shouldTestLoadQuestionsWhenUserStartTest() {

        //Given
        User user = new User();
        QuizSystem mQuizSystem =new QuizSystem(user);


        //When
        TestQuiz test= mQuizSystem.startTest();
        test.loadQuestions();

        //Then
        assertEquals(0,0);

    }


    @Test
    public void userShouldEntersTheSystem() {

        User user = new User();
        QuizSystem mQuizSystem= new QuizSystem(user);

        assertEquals(0,0);

    }

    @Test
    public void systemShouldLoadQuestionsWhenUserStartATest() {

        //Given
        User user = new User();
        QuizSystem mQuizSystem = new QuizSystem(user);


        //when
        TestQuiz test= mQuizSystem.startTest();
        test.loadQuestions();

        //then
        assertEquals(3,test.getQuestions().size());
    }
    @Test
    public void testShouldDisplayAQuestion() {
        //Given
        User user = new User();
        QuizSystem mQuizSystem = new QuizSystem(user);


        //when
        TestQuiz test= mQuizSystem.startTest();
        test.loadQuestions();

        //then
        assertEquals("question 1",test.getQuestion(0).getStatement());

    }

    @Test
    public void userShouldSelectAnswer() {
        //Given
        User user = new User();
        QuizSystem mQuizSystem = new QuizSystem(user);


        //when
        TestQuiz test= mQuizSystem.startTest();
        test.loadQuestions();
        test.pickedAnswer(1);

    }
}

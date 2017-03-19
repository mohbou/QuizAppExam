package com.quizappexam.app.quizappexam.test;

import com.quizappexam.app.quizappexam.model.QuizSystem;
import com.quizappexam.app.quizappexam.model.Session;
import com.quizappexam.app.quizappexam.model.User;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    private QuizSystem mQuizSystem;
    private User mUser;
    private Session mSession;

    @Before
    public void setUp() throws Exception {
        mQuizSystem = new QuizSystem();
        mUser = new User();
        mSession = new Session();

    }

    @Test
    public void testShouldPass() {

        mQuizSystem.showMessage("Welcome back");
        assertEquals(0,mUser.openSession(mSession));

    }

    @Test
    public void testUserShouldSeeWelcomeMessage() {

    }

}
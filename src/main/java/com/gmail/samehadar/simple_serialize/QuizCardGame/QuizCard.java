package com.gmail.samehadar.simple_serialize.QuizCardGame;

/**
 * Quiz Card
 */
public class QuizCard {

    String question;
    String answer;

    public QuizCard(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

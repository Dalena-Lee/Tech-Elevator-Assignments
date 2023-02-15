package com.techelevator.QuizMaker;

import java.util.List;

public class QuizQuestions {
    private String question;
    private String correctAnswer;
    private List<String> answers;

    public QuizQuestions(String question, List<String> answers) {
        this.question = question;
        this.answers = answers;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        correctAnswer = correctAnswer.replaceAll("\\*", "");
        this.correctAnswer = correctAnswer;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
}

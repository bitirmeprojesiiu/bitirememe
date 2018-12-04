package com.example.idildusenkalkan.bitirememe.Model;

public class Exam {

    private String question [];
    private String answers [];
    private String trueAnswer [];

    public String[] getQuestion() {
        return question;
    }

    public String[] getTrueAnswer() {
        return trueAnswer;
    }

    public void setTrueAnswer(String[] trueAnswer) {
        this.trueAnswer = trueAnswer;
    }

    public void setQuestion(String[] question) {

        this.question = question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }
}

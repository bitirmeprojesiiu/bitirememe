package com.example.idildusenkalkan.bitirememe.Model;

import java.util.Date;

public class ExamInfo {

    //sınavdaki soru sayısı
    private int numberOfQuestion;
    //timer için sınavın süresi
    private int timerForExam;
    //sınavın tarihi, zamanı
    private Date examDate = new Date();

    public int getNumberOfQuestion() {
        return numberOfQuestion;
    }

    public void setNumberOfQuestion(int numberOfQuestion) {
        this.numberOfQuestion = numberOfQuestion;
    }

    public int getTimerForExam() {
        return timerForExam;
    }

    public void setTimerForExam(int timerForExam) {
        this.timerForExam = timerForExam;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }
}

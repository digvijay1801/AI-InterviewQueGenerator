package com.dto;

public class InterviewQuestionDTO {
    String technology;
    String expriencelevel;
    int questioncount;

    public InterviewQuestionDTO() {
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getExpriencelevel() {
        return expriencelevel;
    }

    public void setExpriencelevel(String expriencelevel) {
        this.expriencelevel = expriencelevel;
    }

    public int getQuestioncount() {
        return questioncount;
    }

    public void setQuestioncount(int questioncount) {
        this.questioncount = questioncount;
    }
}

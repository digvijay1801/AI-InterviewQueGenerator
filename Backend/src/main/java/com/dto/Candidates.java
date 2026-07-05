package com.dto;

public class Candidates {
    ResponseContent content;

    public Candidates() {
    }

    public Candidates(ResponseContent content) {
        this.content = content;
    }

    public ResponseContent getContent() {
        return content;
    }

    public void setContent(ResponseContent content) {
        this.content = content;
    }
}

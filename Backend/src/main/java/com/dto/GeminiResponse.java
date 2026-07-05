package com.dto;

import java.util.ArrayList;
import java.util.List;

public class GeminiResponse {
    List<Candidates> candidates=new ArrayList<>();

    public GeminiResponse() {
    }

    public GeminiResponse(List<Candidates> candidates) {
        this.candidates = candidates;
    }

    public List<Candidates> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<Candidates> candidates) {
        this.candidates = candidates;
    }
}

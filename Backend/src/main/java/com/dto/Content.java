package com.dto;

import java.util.ArrayList;
import java.util.List;

public class Content {
    List<TextParts> parts=new ArrayList<>();

    public Content(List<TextParts> parts) {
        this.parts = parts;
    }

    public Content() {
    }

    public List<TextParts> getParts() {
        return parts;
    }

    public void setParts(List<TextParts> parts) {
        this.parts = parts;
    }
}

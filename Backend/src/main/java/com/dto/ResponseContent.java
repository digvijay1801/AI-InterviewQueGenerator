package com.dto;

import java.util.ArrayList;
import java.util.List;

public class ResponseContent {

    List<Responseparts> parts;

    public ResponseContent() {
    }

    public ResponseContent(List<Responseparts> parts) {
        this.parts = parts;
    }

    public List<Responseparts> getParts() {
        return parts;
    }

    public void setParts(List<Responseparts> parts) {
        this.parts = parts;
    }
}

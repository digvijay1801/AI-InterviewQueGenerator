package com.service;

import com.dto.Content;
import com.dto.Candidates;
import com.dto.GeminiRequest;
import com.dto.GeminiResponse;
import com.dto.TextParts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tools.jackson.databind.ObjectMapper;

import java.util.List;

@Service
public class GeminiService {
    @Value("${gemini.api.key}")
    String apikey;

    @Autowired
    RestTemplate template;
    private final String GEMINI_URL =
            "https://generativelanguage.googleapis.com/v1beta/models/gemini-2.5-flash:generateContent?key=";

    public String generateQuestion(String technology, String experiencelevel,
                                   int questioncount) {
        String prompt = "Generate " + questioncount +
                " interview questions for " + technology +
                " with " + experiencelevel +
                " experience. Return only numbered questions.";
        String URL = GEMINI_URL + apikey;
        System.out.println(URL);
        TextParts textparts = new TextParts(prompt);
        List<TextParts> parts = List.of(textparts);
        Content content = new Content(parts);
        List<Content> contents = List.of(content);
        GeminiRequest geminirequest = new GeminiRequest(contents);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        //create proper request by combining Requestbody and headers

//        ObjectMapper mapper = new ObjectMapper();

//        System.out.println(mapper.writeValueAsString(geminirequest));
        HttpEntity<GeminiRequest> entity = new HttpEntity<>(geminirequest, headers);

        GeminiResponse response = template.postForObject(URL, entity, GeminiResponse.class);

        String result = response.getCandidates().get(0).getContent().getContent().getParts().get(0).getText(0);

        return result;
    }


}

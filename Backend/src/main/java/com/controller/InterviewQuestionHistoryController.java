package com.controller;

import com.dto.InterviewQuestionDTO;
import com.entity.InterviewQuestionHistory;
import com.service.GeminiService;
import com.service.InterviwQuestionHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class InterviewQuestionHistoryController {

    @Autowired
    InterviwQuestionHistoryService service;

    @PostMapping("/save")
    public String addintervieqquestionrequest(@RequestBody InterviewQuestionDTO dto)
    {
        return service.addinterviewquestion(dto);
    }
    @GetMapping("/load")
    public List<InterviewQuestionHistory> findallquestions()
    {
        return service.findallinterviewquestions();
    }
    @DeleteMapping("/delete")
    public String delete(@RequestParam int id)
    {
        return service.deleteinterviewquestionhistory(id);
    }

    @Autowired
    private GeminiService geminiService;

    @PostMapping("/generatequestion")
    public String generate(@RequestBody InterviewQuestionDTO dto) {

        return geminiService.generateQuestion(
                dto.getTechnology(),
                dto.getExpriencelevel(),
                dto.getQuestioncount()
        );
    }

}


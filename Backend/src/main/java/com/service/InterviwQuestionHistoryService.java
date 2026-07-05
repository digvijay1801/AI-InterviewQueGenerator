package com.service;

import com.dto.InterviewQuestionDTO;
import com.entity.InterviewQuestionHistory;
import com.repository.InterviewQuestionHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviwQuestionHistoryService {
    @Autowired
    InterviewQuestionHistoryRepository iresp;
@Autowired
GeminiService geminiService;
    public String addinterviewquestion(InterviewQuestionDTO dto)
    {
        InterviewQuestionHistory interviewhistory=
                new InterviewQuestionHistory();
        interviewhistory.setTechnology(dto.getTechnology());
        interviewhistory.setExpriencelevel(dto.getExpriencelevel());
        interviewhistory.setQuestioncount(dto.getQuestioncount());
        String result = geminiService.generateQuestion(
                dto.getTechnology(),
                dto.getExpriencelevel(),
                dto.getQuestioncount()
        );
        interviewhistory.setQuestions(result);
        iresp.save(interviewhistory);
        return result;

    }
    public List<InterviewQuestionHistory> findallinterviewquestions()
    {
        return iresp.findAll();
    }
   public String deleteinterviewquestionhistory(int id)
   {
       if(iresp.existsById(id))
       {
           iresp.deleteById(id);
           return "Interview question history deleted";
       }
       else {
           return "Given Interview question history id does not exists";
       }
   }

}

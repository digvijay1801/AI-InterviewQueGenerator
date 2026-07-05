package com.repository;

import com.entity.InterviewQuestionHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterviewQuestionHistoryRepository  extends
        JpaRepository<InterviewQuestionHistory,Integer> {
}

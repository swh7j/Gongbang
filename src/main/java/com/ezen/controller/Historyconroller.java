package com.ezen.controller;

import com.ezen.domain.dto.MemberDto;
import com.ezen.domain.entity.HistoryEntity;
import com.ezen.domain.entity.MemberEntity;
import com.ezen.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

@Controller
public class Historyconroller {

    @Autowired
    private HistoryService historyService;


    @PostMapping("/history/historydelete")
    @ResponseBody
    @Transactional
    public String historydelete(@RequestParam("historyNo") int historyNo) {

        boolean result = historyService.historydelete(historyNo);
        if (result) {
            return "1";
        } else {
            return "2";
        }
    }

}

package com.beom.attendance.controller;


import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class AttendanceController {


    @GetMapping("/slack")
    public String send(){
        RestTemplate restTemplate = new RestTemplate();
        LocalDateTime startTime = LocalDateTime.now();
        Map<String,Object> request = new HashMap<String,Object>();
        request.put("username", "출석 체크");
        request.put("text", "오늘 출근 "+startTime.getHour()+ ":" +startTime.getMinute() + "오늘 퇴근"+startTime.plusHours(8).getHour()+":"+startTime.getMinute());
        HttpEntity<Map<String,Object>> entity = new HttpEntity<Map<String,Object>>(request);
        String url = "https://hooks.slack.com/services/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"; // 사용할 슬랙의 Webhook URL 넣기
        restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
        return "hello";
    }

}

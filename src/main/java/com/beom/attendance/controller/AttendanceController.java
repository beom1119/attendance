package com.beom.attendance.controller;


import com.beom.attendance.service.AttendanceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.parsing.Problem;

import org.springframework.http.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
@Slf4j
@RestController
public class AttendanceController {

    public final AttendanceService attendanceService;

    public AttendanceController(AttendanceService attendanceService) {
        this.attendanceService = attendanceService;
    }



    @GetMapping("/hell123")
    public String hello12321()
    {
        return "hello123123";
    }

    @GetMapping("/index")
    public String hello() throws Exception {
        attendanceService.sendSlackMessage("이범기");
        return "index";
    }


}

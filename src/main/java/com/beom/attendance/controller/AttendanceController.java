package com.beom.attendance.controller;


import com.beom.attendance.entity.Employee;
import com.beom.attendance.service.AttendanceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AttendanceController {

    public final AttendanceService attendanceService;

    public AttendanceController(AttendanceService attendanceService) {
        this.attendanceService = attendanceService;
    }


    @GetMapping("/hello")
    public String hello()
    {
        return "hello";
    }

    @GetMapping("/hell123")
    public String hello12321()
    {
        return "hello123123";
    }

    @GetMapping("/index")
    public List<Employee> index()
    {
        return attendanceService.index();
    }


}

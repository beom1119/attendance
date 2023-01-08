package com.beom.attendance.service;

import com.beom.attendance.entity.Employee;
import com.beom.attendance.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Slf4j
@Service
public class AttendanceService {

    private final EmployeeRepository employeeRepository;


    public AttendanceService(EmployeeRepository employeeRepository)
    {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> index()
    {
        return (List<Employee>) employeeRepository.findAll();
    }

}

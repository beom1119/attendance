package com.beom.attendance.dto;

import com.beom.attendance.entity.Employee;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;


public class EmployeeDto {
    Employee employee;

    public EmployeeDto(Employee employee) {
        this.employee = employee;
    }


    public  Long id;
    public String name;
    public LocalDateTime startTime;
    public LocalDateTime endTime;


    public Employee toEntity()
    {
        return new Employee(id,name,startTime,endTime);
    }


}

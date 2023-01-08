package com.beom.attendance.repository;

import com.beom.attendance.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {


}

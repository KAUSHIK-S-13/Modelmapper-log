package com.model.mapper.Service;

import com.model.mapper.DTO.EmployeeDTO;
import com.model.mapper.Model.Employee;

import java.util.Optional;

public interface Employeeinterface{


    Employee Saveemp(EmployeeDTO employeeDTO);

    Optional<Employee> FindByUserId(int id);
}

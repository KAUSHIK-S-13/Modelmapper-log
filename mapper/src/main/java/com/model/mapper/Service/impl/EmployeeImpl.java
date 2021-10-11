package com.model.mapper.Service.impl;

import com.model.mapper.DTO.EmployeeDTO;
import com.model.mapper.Model.Employee;
import com.model.mapper.Repository.EmployeeRepository;
import com.model.mapper.Service.Employeeinterface;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class EmployeeImpl implements Employeeinterface {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee Saveemp(EmployeeDTO employeeDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Employee employee=modelMapper.map(employeeDTO,Employee.class);
        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public Optional<Employee> FindByUserId(int id) {
            Optional<Employee> employee = employeeRepository.findById(id);
            return employee;
    }
}

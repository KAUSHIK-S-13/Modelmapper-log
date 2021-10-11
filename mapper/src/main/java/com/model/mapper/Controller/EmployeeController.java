package com.model.mapper.Controller;

import com.model.mapper.BaseResponse.BaseResponse;
import com.model.mapper.DTO.EmployeeDTO;
import com.model.mapper.Model.Employee;
import com.model.mapper.Service.Employeeinterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RequestMapping("/employee")
@RestController

public class EmployeeController{

    @Autowired
    private Employeeinterface employeeinterface;

    private static final Logger logger =LoggerFactory.getLogger(EmployeeController.class);

    @PostMapping(value = "/save")
    public BaseResponse save(@RequestBody EmployeeDTO employeeDTO) {
        BaseResponse<Employee>  base =null;
        base=BaseResponse.<Employee>builder().Data(employeeinterface.Saveemp(employeeDTO)).build() ;
        return base;
    }

    @GetMapping("/{id}")
    public BaseResponse<Optional<Employee>> FindByUserId(@PathVariable int id)  {
        logger.info("check message1");
        BaseResponse<Optional<Employee>> base=null;
        logger.info("check message2");
        base =BaseResponse.<Optional<Employee>>builder().Data(employeeinterface.FindByUserId(id)).build();
        logger.info("check message3");
        return base;
         /*logger.warn("check message2");
        logger.error("check message3");
        logger.debug("check message4");*/
    }
}

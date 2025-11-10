package com.igreaper.learning.Introduction.Controller;

import com.igreaper.learning.Introduction.dto.EmployeeDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/{employeeId}")
    public EmployeeDTO getEmployee(@PathVariable Long employeeId){
        return new EmployeeDTO(employeeId,"Pratham","prathams1334@gmail.com",23);
    }

}

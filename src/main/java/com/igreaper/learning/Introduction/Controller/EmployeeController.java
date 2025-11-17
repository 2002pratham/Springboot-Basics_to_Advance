package com.igreaper.learning.Introduction.Controller;

import com.igreaper.learning.Introduction.Entity.EmployeeEntity;
import com.igreaper.learning.Introduction.Repository.EmployeeRepository;
import com.igreaper.learning.Introduction.Service.EmployeeService;
import com.igreaper.learning.Introduction.dto.EmployeeDTO;
import jakarta.persistence.Id;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


   private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable (name = "employeeId") Long id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/allEmployees")
    public List<EmployeeDTO> allEmployees(){
        return employeeService.findAll();
    }

    @PostMapping("/createEmployee")
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.save(employeeDTO);
    }

    @DeleteMapping("/deleteEmployee")
    public void deleteEmployee(@RequestParam Long Id ){
        employeeService.deleteById(Id);
    }

}

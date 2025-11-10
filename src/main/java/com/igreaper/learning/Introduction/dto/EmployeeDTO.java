package com.igreaper.learning.Introduction.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;



@AllArgsConstructor
@Data
public class EmployeeDTO {
    private Long id;
    private String name;
    private String email;
    private Integer age;

    public EmployeeDTO(Long id, String name, String email, Integer age, LocalDate dateOfJoining){
        this.id=id;
        this.name=name;
        this.email=email;
        this.age=age;
    }
    public EmployeeDTO(){

    }
}

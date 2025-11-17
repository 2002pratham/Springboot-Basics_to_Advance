package com.igreaper.learning.Introduction.Service;

import com.igreaper.learning.Introduction.Entity.EmployeeEntity;
import com.igreaper.learning.Introduction.Repository.EmployeeRepository;
import com.igreaper.learning.Introduction.config.MapperConfig;
import com.igreaper.learning.Introduction.dto.EmployeeDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final MapperConfig mapperConfig;


    public EmployeeService(EmployeeRepository employeeRepository, MapperConfig mapperConfig) {
        this.employeeRepository = employeeRepository;
        this.mapperConfig = mapperConfig;
    }


    public EmployeeDTO getEmployeeById(Long id) {
        EmployeeEntity employeeEntity = employeeRepository.findById(id).orElse(null);
        return mapperConfig.getmodelMapper().map(employeeEntity,EmployeeDTO.class);
    }

    public List<EmployeeDTO> findAll() {
        List<EmployeeEntity>employeeEntity =  employeeRepository.findAll();
        return employeeRepository.findAll()
                .stream()
                .map(entity -> mapperConfig.getmodelMapper().map(entity, EmployeeDTO.class))
                .toList();
    }

    public EmployeeDTO save(EmployeeDTO employeeDTO) {
        EmployeeEntity toSaveEntity = mapperConfig.getmodelMapper().map(employeeDTO,EmployeeEntity.class);
        EmployeeEntity savedEmployee = employeeRepository.save(toSaveEntity);
        return mapperConfig.getmodelMapper().map(savedEmployee,EmployeeDTO.class);

    }

    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }
}

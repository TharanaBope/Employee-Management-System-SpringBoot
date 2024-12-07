package com.tharana.springbootbackend.service.impl;

import com.tharana.springbootbackend.exception.ResourceNotFoundException;
import com.tharana.springbootbackend.model_entity.Employee;
import com.tharana.springbootbackend.repository.EmployeeRepository;
import com.tharana.springbootbackend.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isPresent()){
            return employee.get();
        }else{
            throw new ResourceNotFoundException("Employee", "Id", id);
        }
    }

    @Override
    public Employee updateEmployee(Employee employee, long id) {
        // we need to check ehreter emplyee with given id is exist in DB or Not
        Employee existEmployee = EmployeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));
        existEmployee.setFirstName(employee.getFirstName());
        existEmployee.setLastName(employee.getLastName());
        existEmployee.setEmail(employee.getEmail());

        //save existing employee to DB
        EmployeeRepository.save(existEmployee);
        return null;
    }

    @Override
    public void deleteEmployee(long id) {
        //check where a emplyee exist in DB or not
        employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));

        employeeRepository.deleteById(id);
    }
}

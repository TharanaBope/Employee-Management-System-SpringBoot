package com.tharana.springbootbackend.repository;

import com.tharana.springbootbackend.model_entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

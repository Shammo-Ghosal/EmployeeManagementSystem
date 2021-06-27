package com.example.employeemanager.repository;

import com.example.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo  extends JpaRepository<Employee, Long> {
    static Optional<Employee> findEmployeeById(Long id) {
        return Optional.empty();
    }

    void deleteEmployeeByID(Long id);

}

package com.example.demo.repository;

import com.example.demo.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IEmployeeRepo extends CrudRepository<Employee,Long> {
//    List<Employee> findAllBy
}

package com.example.SpringBootApiCurd.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootApiCurd.entity.Employee;


@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	Employee findByName(String username);

}

package com.example.SpringBootApiCurd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootApiCurd.dao.EmployeeDao;
import com.example.SpringBootApiCurd.entity.Employee;
import com.example.SpringBootApiCurd.exception.SmitaIdNotFpoundException;

@Service
public class EmployeeService {

	// depended

	@Autowired
	private EmployeeDao employeeDao;

	// carete Employee

	public Employee careteEmployee(Employee employee) {

		return employeeDao.save(employee);
	}

	// fetch all

	public List<Employee> getAllEmployees() {
		return employeeDao.findAll();
	}

	
	//1,2,3
	// update

	public Employee updateEmployee(Employee employee2, int id) throws SmitaIdNotFpoundException {
		Employee employee = employeeDao.findById(id).orElseThrow(()->new SmitaIdNotFpoundException("Employee is is not present"+id));
		
		
		
		

		employee.setName(employee2.getName());
		employee.setEmail(employee2.getEmail());
		employee.setAdress(employee2.getAdress());

		return employeeDao.save(employee);
	}
	
	//delete
	
	public void deleteEmployee(int id) throws SmitaIdNotFpoundException
	{
		Employee employee = employeeDao.findById(id).orElseThrow(()->new SmitaIdNotFpoundException("Employee is is not present"+id));
		
		  employeeDao.delete(employee);
	}
}

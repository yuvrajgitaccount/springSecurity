package com.example.SpringBootApiCurd.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.SpringBootApiCurd.dao.EmployeeDao;
import com.example.SpringBootApiCurd.entity.Employee;
import com.example.SpringBootApiCurd.exception.SmitaIdNotFpoundException;


@Service
public class UserSecurtiyService implements UserDetailsService {

	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
	Employee employee=	 employeeDao.findByName(username).orElseThrow(()->new SmitaUsernameisnotExsitExtion("Employee is username is not present"+username));
		
		
		
		return null;
	}

}

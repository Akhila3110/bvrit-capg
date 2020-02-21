package com.cg.ems.service;

import java.util.HashMap;
import java.util.List;

import com.cg.ems.model.Customer;
import com.cg.ems.exception.CustomerException;
import com.cg.ems.model.Customer;

public interface EmployeeService {
	public boolean validateUserName(String userName);
	public boolean validatePass(String passWord);
	public boolean validateEmail(String eMail);
	public void register(Customer customer) throws CustomerException;
	public boolean login(String str1,String str2) throws CustomerException;
	public boolean logout(String str) throws CustomerException;
	public boolean validateAccountNo(String customerAccountNo);
	public boolean validateContactNumber(String contactNo); 
	public boolean validatePanNumber(String PanNum);
	public boolean validateAadharNumber(String adharNo);
	public boolean validateZipCode(String zipCode);
    public boolean addCustomer(Customer customer)  throws CustomerException;       //add all employees
    public Customer findCustomerAccountNo(String customerAccountNo)  throws CustomerException; //finds id and returns the information of employee of Employee type
	public List<Customer> findAllCustomers()  throws CustomerException;     //gives the list of employees and throws exception if list is empty
	public HashMap<String,Customer> getList();
	

	
	
	
	

}

package com.cg.ems.dao;
import java.util.HashMap;
import java.util.List;

import com.cg.ems.exception.CustomerException;
import com.cg.ems.model.Customer;
public interface EmployeeDao {  //interface is used to know the methods and they need to be implemented //(abstraction)
	public void register(Customer customer) throws CustomerException;
	public boolean login(String str1,String str2) throws CustomerException;
	public boolean logout(String str) throws CustomerException;
	public String addCustomer(Customer customer) throws CustomerException;       //adding customers
	public Customer findCustomerAccountNo(String customerAccountNo) throws CustomerException; //finds id and returns the information of customer 
	public HashMap<String,Customer> getList();
	List<Customer> findAllCustomer() throws CustomerException;

}

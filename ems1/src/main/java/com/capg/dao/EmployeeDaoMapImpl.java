package com.capg.dao;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capg.model.Customer;
import com.capg.model.Address;
import com.capg.dao.EmployeeDao;
import com.capg.exception.CustomerException;
import com.capg.model.Customer;

public class EmployeeDaoMapImpl implements EmployeeDao{
	private Map<String, Customer> map;
    Customer customer=null;
	public EmployeeDaoMapImpl()
	{
		map=new HashMap<String,Customer>();
	}
	
	public HashMap<String,Customer> getList(){
		return (HashMap<String, Customer>) map;
	}
	
//	public void addDetails() {
//		
//	Address a1=new Address("h.no:1234","h.no:4567","Hyderabad","Telangana","India",502121);
//	Customer c1=new Customer("akhila","123456789123","9515189083","987654321234","abcde1234f",new Date(1998,10,31),"female","123456",a1);
//	Address a2=new Address("h.no:4321","h.no:7654","Gajwel","Telangana","India",502278);
//	Customer c2=new Customer("abhishek","987654321987","9989765432","314263954567L","bcdaf1534g",new Date(1997,05,17),"male","87654",a2);
//	map.put("abhishek@pecunia.com", c1);
//	map.put("prameela@pecunia.com", c2);
//	
//	}
	
	
	public String addCustomer(Customer customer) throws CustomerException {
		boolean flag=map.containsKey(customer.getCustomerAccountNo());
		if(flag)
		{
		throw new CustomerException("Account exists");
		}
		else
		{
		map.put(customer.getCustomerAccountNo(),customer);
		}
		return (customer.getCustomerAccountNo());
	}

	@Override
	public Customer findCustomerAccountNo(String customerAccountNo) throws CustomerException {
		// TODO Auto-generated method stub
		boolean flag=map.containsKey(customerAccountNo);
		Customer customer=null;
		if(flag)
		{
		customer=map.get(customerAccountNo);
		}
		else
		{
		throw new CustomerException(customerAccountNo+"Account no not found");
		}
		return customer;
		}
	@Override
	public List<Customer> findAllCustomer() throws CustomerException {
		// TODO Auto-generated method stub
		Collection<Customer> col=map.values();
		List<Customer> list=new ArrayList<Customer>(col);
		return list;
	}

	@Override
	public void register(Customer customer) throws CustomerException {
		// TODO Auto-generated method stub
		if(!map.containsKey(customer.getCustomerUserName()))
		{
			map.put(customer.getCustomerUserName(),customer);
		}
		else
		{
			throw new CustomerException("Id already exists");
		}
		
	}

	@Override
	public boolean login(String str1, String str2) throws CustomerException {
		// TODO Auto-generated method stub
		if(map.containsKey(str1))
		{
			Customer customer=map.get(str1);
			if(customer.isStatus()==true)
			{
				throw new CustomerException("You are already logged in");
			}
			if(customer.getCustomerPass().equals(str2))
			{
				customer.setStatus(true);
			}
			return true;
		}
		else
		{
			throw new CustomerException("You have not registerd");
		}
	}

	@Override
	public boolean logout(String str) throws CustomerException {
		// TODO Auto-generated method stub
		boolean status=false;
		if(!map.containsKey(str))
		{
			throw new CustomerException("You are not logged in");
		}
		Customer customer=map.get(str);
		boolean flag=customer.isStatus();
		if(flag==true)
		{
			status=false;
		}
		return status;
	}

}	
	
	
package com.cg.ems.service;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.ems.dao.EmployeeDao;
import com.cg.ems.dao.EmployeeDaoMapImpl;
import com.cg.ems.exception.CustomerException;
import com.cg.ems.model.Customer;
public class EmployeeServiceImpl implements EmployeeService{
	 public static boolean checkMatch(String regex, CharSequence input) {
	        Pattern p = Pattern.compile(regex);
	        Matcher m = p.matcher(input);
	        return m.find();
	    }
     private EmployeeDao employeeDao=new EmployeeDaoMapImpl();
    
     public HashMap<String,Customer> getList(){
    	 return employeeDao.getList();
     }
	@Override
	public boolean validateAccountNo(String customerAccountNo) {
		// TODO Auto-generated method stub
		boolean flag=false;
		flag=Pattern.matches("[0-9]{12}+",customerAccountNo);
		return flag;
	}
	@Override
	public boolean validateContactNumber(String contactNo) {
		// TODO Auto-generated method stub
		boolean flag=false;
		flag=contactNo.matches("[0-9]{10}+");
		return flag;
	}
	@Override
	public boolean validatePanNumber(String PanNum) {
		// TODO Auto-generated method stub
		boolean flag=false;
		flag=PanNum.matches("[a-zA-Z]{5}[0-9]{4}[a-zA-Z]{1}+");
		return flag;
	}
	@Override
	public boolean validateAadharNumber(String adharNo) {
		// TODO Auto-generated method stub
		boolean flag=false;
		flag=adharNo.matches("[0-9]{12}+");
		return flag;
	}
	@Override
	public boolean validateZipCode(String zipCode) {
		// TODO Auto-generated method stub
		boolean flag=false;
		flag=zipCode.matches("[0-9]{6}+");
		return flag;
	}
	@Override
	public boolean addCustomer(Customer customer) throws CustomerException {
		// TODO Auto-generated method stub
		String customerName=customer.getCustomerName();
	    Date customerDoB=customer.getCustomerDob();
	    String customerGender=customer.getCustomerGender();
	    String accountNum=customer.getCustomerAccountNo();
	    boolean flag=validateAccountNo(accountNum);
	    if(!flag)
	    {
	    throw new CustomerException("Account number should contain 12 digits");
	    }
	    return true;  
	}   
	@Override
	public Customer findCustomerAccountNo(String customerAccountNo) throws CustomerException {
		// TODO Auto-generated method stub
		String accountNum = String.valueOf(customerAccountNo);    //convert int to string
		boolean flag = accountNum.matches("[0-9]{12}");
				if(!flag)
				{
					throw new CustomerException("Account should be 12 digit number");
				}
		Customer customer = employeeDao.findCustomerAccountNo(customerAccountNo);
		return customer;
	}
	@Override
	public List<Customer> findAllCustomers() throws CustomerException {
		// TODO Auto-generated method stub
		return employeeDao.findAllCustomer();
	}
	@Override
	public boolean validateUserName(String userName) {
		// TODO Auto-generated method stub
		boolean flag=checkMatch("[a-zA-Z0-9]",userName);
		
		return flag;
	}
	@Override
	public boolean validatePass(String passWord) {
		// TODO Auto-generated method stub
		boolean flag=checkMatch("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,15}$",passWord);
		return flag;
	}
	@Override
	public boolean validateEmail(String eMail) {
		// TODO Auto-generated method stub
		boolean flag=checkMatch("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$",eMail);
		return flag;
	}
	@Override
	public void register(Customer customer) throws CustomerException {
		// TODO Auto-generated method stub
		String userName=customer.getCustomerUserName();
		boolean flag1=validateUserName(userName);
		if(!flag1)
		{
			throw new CustomerException("User name should contain alphabets and numbers");
		}
		String passWord=customer.getCustomerPass();
		boolean flag2=validatePass(passWord);
		if(!flag2)
		{
		throw new CustomerException("password should contain atleast one uppercase character, lowercase character, one digit, and one special character");
		}
		String emailId=customer.getCustomerEmail();
		boolean flag3=validateEmail(emailId);
		if(!flag3)
		{
		throw new CustomerException("email id should be in correct format");
		}
		employeeDao.register(customer);
		}
	@Override
	public boolean login(String str1, String str2) throws CustomerException {
		// TODO Auto-generated method stub
		boolean flag1=validateUserName(str1);
		if(!flag1)
		{
		throw new CustomerException("User name should contain alphabets and numbers");
		}

		boolean flag2=validatePass(str2);
		if(!flag2)
		{
		throw new CustomerException("password should contain atleast one uppercase character, lowercase character, one digit, and one special character");
		}

		return employeeDao.login(str1, str2);
	}
	@Override
	public boolean logout(String str) throws CustomerException {
		{
		boolean flag1=validateUserName(str);
		if(!flag1)
		{
		throw new CustomerException("User name should contain alphabets and numbers");
		}

		return employeeDao.logout(str);
		}
	}
	}

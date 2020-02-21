package com.capg.ems1;

import static org.junit.Assert.*;


import org.junit.Test;

import com.capg.dao.EmployeeDao;
import com.capg.dao.EmployeeDaoMapImpl;
import com.capg.model.Customer;

public class CustomerTest {
	EmployeeDao dao=null;
	@BeforeEach
	public void setup()
	{
		 dao=new EmployeeDaoMapImpl();
	}

	@Test
	public void testlogin() throws Exception{
		Customer c=new Customer();
		c.setCustomerUserName("akhila123");
		c.setCustomerPass("Akhila123@");
		dao.login(c);
		boolean a=dao.login("akhila123","Akhila123@");
		assertTrue(a==true);
		
	}

}

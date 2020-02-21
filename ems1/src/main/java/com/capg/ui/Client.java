package com.capg.ui;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capg.model.Customer;
import com.capg.exception.CustomerException;
import com.capg.model.Address;
import com.capg.model.Customer;
import com.capg.service.EmployeeService;
import com.capg.service.EmployeeServiceImpl;

public class Client {
	
//	 public static boolean matches(String regex, CharSequence input) {
//	        Pattern p = Pattern.compile(regex);
//	        Matcher m = p.matcher(input);
//	        return m.find();
//	    }
	 
	public static void main(String[] args) {
		
			EmployeeService es=new EmployeeServiceImpl();
			Scanner in=new Scanner(System.in);
			int choice=0;
			Customer customer=null;
			while(true)
			{
			System.out.println("1.Register");
			System.out.println("2.Login");
			System.out.println("3.add customer details");
			System.out.println("4.logout");
			System.out.println("5.Exit");
			System.out.println("Enter your choice");
			choice=in.nextInt();
			switch(choice)
			{
			case 1:
			try
			{
			       System.out.println("Enter the user name");
			       String username=in.next()+in.nextLine();
			       System.out.println("Enter the password");
			       String password=in.next()+in.nextLine();
			       System.out.println("Enter the email id ");
			       String emailid=in.next()+in.nextLine();
			       System.out.println("Enter the phonenumber");
			       String contactnumber=in.next()+in.nextLine();
			       customer = new Customer();
			       customer.setCustomerUserName(username);
			       customer.setCustomerPass(password);
			       customer.setCustomerEmail(emailid);
			       customer.setCustomerContact(contactnumber);
			       es.register(customer);
			       System.out.println("regestration successful");
			}
			catch(Exception e)
			{
			e.printStackTrace();
			}
			break;
			case 2:
				try
				{
				System.out.println("enter the user name");
				String username1=in.next()+in.nextLine();
				System.out.println("enter the password");
				String password1=in.next()+in.nextLine();
//				customer.setCustomerUserName(username1);
//				customer.setCustomerPass(password1);
				es.login(username1, password1);
				System.out.println("successfully logged in");
				}
				catch(Exception e)
				{
				e.printStackTrace();
				}
				break;
			case 3:
				System.out.println("Create a new Account ");
				try
				{
				 System.out.println("Enter customer name");
				 String cName=in.next()+in.nextLine();
				 
				 System.out.println("Enter the password");
				 String cPword=in.next()+in.nextLine();
				 System.out.println("Enter customer Account number");
				 String accntNum=in.nextLine();
				 System.out.println("Enter contact number");
				 String cNum=in.nextLine();
				 System.out.println("Enter Aadhar number");
				 String cAadhar=in.nextLine();
				 System.out.println("Enter PAN ");
				 String cPan=in.nextLine();
				 System.out.println("Enter DoB (eg 1995-02-25)");
				 String date=in.next()+in.nextLine();
				 SimpleDateFormat smf=new SimpleDateFormat("yyyy-MM-dd");
				 Date cDoB=smf.parse(date);
				 System.out.println("Enter gender");
				 String cGender=in.nextLine();
				 System.out.println("Enter UserName");
				 String cUser=in.nextLine();
				 System.out.println("Enter email");
				 String email=in.nextLine();
				 System.out.println("Enter addressline1");
				 String ad1=in.nextLine();
				 System.out.println("Enter addressline2");
				 String ad2=in.nextLine();
				 System.out.println("Enter city");
				 String cityName=in.nextLine();
				 System.out.println("Enter State");
				 String stateName=in.nextLine();
				 System.out.println("Enter country");
				 String countryName=in.nextLine();
				 System.out.println("Enter zipcode");
				 int zipCode=in.nextInt();
				 
				 Address ac=new Address();
				 ac.setAddressline1(ad1);
				 ac.setAddressline2(ad2);
				 ac.setCity(cityName);
				 ac.setState(stateName);
				 ac.setCountry(countryName);
				 ac.setZipcode(zipCode);
    Customer c=new Customer(cName,accntNum,cNum,cAadhar,cPan,cDoB,cGender,cPword,cUser,email,false,ac);
	es.addCustomer(c);
	System.out.println("Account created successfully");
System.out.println("Customer details: customerName=" +c.getCustomerName()+","+"password="+c.getCustomerPass()+","+"accountNumber="+c.getCustomerAccountNo()+","+"\n"+"contactNo="+c.getCustomerContact()
+","+"adharNo="+c.getCustomerAdhar()+","+"panNo="+c.getCustomerPan()+","+"DoB="+c.getCustomerDob()+","+"Gender="+c.getCustomerGender()+","+"UserName="+c.getCustomerUserName()+","+"Email="+c.getCustomerEmail()
+","+"\n"+"address="+c.getCustomerAddress());
				 
				 }
				catch(Exception e)
				{
				System.out.println(e);
				}
				break;
			case 4:
				try
				{
				System.out.println("enter the user name");
				String username1=in.next()+in.nextLine();
				es.logout(username1);
				System.out.println("successfully logged out");
				}
				catch(Exception e)
				{
				e.printStackTrace();
				}
				break;
			case 5:
				System.out.println("exit");
				System.exit(0);
				break;
				default:
					System.out.println("Invalid choice");
			}
			}
	}
}

//				case 0:
//						 String str= "Login failed";
//						System.out.println("Invalid Credentials");
//						System.out.println(str);
//						String pswrd=in.next();
//						mydata.replace(email_id, pswrd);
//						System.out.println("Password changed successfully");
//						System.out.println(email_id);
//						break;
//				
//					
//					
//						}
//	}
//}
//}
	

	

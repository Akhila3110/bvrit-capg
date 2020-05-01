package com.capg.exception;
public class CustomerException  extends Exception{
	public CustomerException(String message) //constructor to handle the exception . It is handled by super class ie. Exception
	{
		super(message);	
    }
	public CustomerException()  //Default constructor
	{
		super();	
    }
	}

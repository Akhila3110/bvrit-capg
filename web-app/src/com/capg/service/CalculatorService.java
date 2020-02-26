package com.capg.service;

public class CalculatorService {

	public float calculate(int x,int y,String option) {
		float result=0;
		switch(option) {
		case "Add":
			result=x+y;
			break;
		case "Subtract":
			result=x-y;
			break;
		case "Multiply":
			result=x*y;
			break;
		case "Divide":
			result=x/(float)y;
			break;
		}
		return result;
	}
}

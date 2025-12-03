package com.Wiley.Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


class SalaryNotInRangeException extends Exception{
	SalaryNotInRangeException(String s){
		super(s);
	}
}
class Test{
public static void main(String[] ar) throws  SalaryNotInRangeException {
        System.out.println("Enter salary");   
		Scanner sc = new Scanner(System.in);
		int salary=sc.nextInt();
	try {
		if(salary<6000 || salary>20000)
			throw new SalaryNotInRangeException("Please provide salary within the range of 6000 and 20000");
	}catch(SalaryNotInRangeException e) {
		System.out.println(e.getMessage());
	}
	}
	
}


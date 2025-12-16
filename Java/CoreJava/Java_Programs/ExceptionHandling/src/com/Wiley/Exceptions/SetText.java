package com.Wiley.Exceptions;


//A Class that represents use-defined expception
class MyException extends Exception
{
MyException(String s){
	 super(s);

}
}

//A Class that uses above MyException
public class SetText
{
	// Driver Program
	public static void main(String args[])
	{
		try
		{
			// Throw an object of user defined exception
			throw new MyException("this is invalid");
		}
		catch (MyException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}

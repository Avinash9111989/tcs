
public class StaticVariable {
	//Java Program to illustrate the use of static variable which  
	//is shared with all objects.  
	 static int count=0;//will get memory only once and retain its value  
	  
	StaticVariable(){  
	count++;//incrementing the value of static variable  
	System.out.println(count);  
	}  
	  
	public static void main(String args[]){  
	//creating objects  
		StaticVariable c1=new StaticVariable();  
		StaticVariable c2=new StaticVariable();  
		StaticVariable c3=new StaticVariable();  
	}  
	}  


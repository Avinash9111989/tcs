
public class ParameterizedConstructor {
	//Java Program to demonstrate the use of the parameterized constructor.  
	 
	    int id;  
	    String name;  
	    //creating a parameterized constructor  
	    ParameterizedConstructor(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    //method to display the values  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    //creating objects and passing values  
	    	ParameterizedConstructor s1 = new ParameterizedConstructor(111,"Karan");  
	    	ParameterizedConstructor s2 = new ParameterizedConstructor(222,"Aryan");  
	    //calling method to display the values of object  
	    s1.display();  
	    s2.display();  
	   }  
	}  



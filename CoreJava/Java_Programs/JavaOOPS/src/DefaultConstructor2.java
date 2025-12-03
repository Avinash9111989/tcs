
public class  DefaultConstructor2{
	//Let us see another example of default constructor  
	//which displays the default values  
	  
	int id;  
	String name;  
	//method to display the value of id and name  
	void display(){System.out.println(id+" "+name);}  
	  
	public static void main(String args[]){  
	//creating objects  
		DefaultConstructor2 s1=new DefaultConstructor2();  
		DefaultConstructor2 s2=new DefaultConstructor2();  
	//displaying values of the object  
	s1.display();  
	s2.display();  
	}  
	}  

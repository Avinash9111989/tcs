
public class UserDefinedMethod {
	//user defined method  
	public  void findEvenOdd(int num)  
	{  
	//method body  
	if(num%2==0)   
	System.out.println(num+" is even");   
	else   
	System.out.println(num+" is odd");  
	}  
	public static void main(String[] a) {
		UserDefinedMethod udm= new UserDefinedMethod();
		udm.findEvenOdd(5);
		udm.findEvenOdd(6);
	}
}

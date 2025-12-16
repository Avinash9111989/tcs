package thisKeyword;

class A{  
void m(){System.out.println("hello m");}  
void n(){  
System.out.println("hello n");
B b = new B();
b.m();
//m();//same as this.m()  
this.m();  
}  
class B{
void m(){
	System.out.println("Inside m method of class B");	
	}
}
}  
class TestThis4{  
public static void main(String args[]){  
A a1=new A();  
A a2=new A();  
a1.n();  
a2.n(); 
}}  
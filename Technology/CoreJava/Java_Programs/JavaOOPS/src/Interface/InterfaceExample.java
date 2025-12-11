package Interface;


interface Printable{  
void print();  
}  
interface Showable{  
void show();  
}  
class InterfaceExample implements Printable,Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
	InterfaceExample obj = new InterfaceExample();  
obj.print();  
obj.show();  
 }  
}  
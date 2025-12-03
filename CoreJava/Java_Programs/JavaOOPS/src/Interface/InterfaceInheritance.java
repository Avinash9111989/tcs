package Interface;


interface Printable1{  
void print();  
}  
interface Showable1 extends Printable1{  
void show();  
}  
class InterfaceInheritance implements Showable1{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
	InterfaceInheritance obj = new InterfaceInheritance();  
obj.print();  
obj.show();  
 }  
}  
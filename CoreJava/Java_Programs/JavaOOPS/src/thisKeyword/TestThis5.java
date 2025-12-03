package thisKeyword;

class A1{  
A1(){System.out.println("hello a");}  
A1(int x){  
this(6,7);  
System.out.println(x);  
}  
A1(int x,int y){   
System.out.println(x+" "+y);  
} 
}  
class TestThis5{  
public static void main(String args[]){  
A1 a=new A1(10);  
}}  

//Constructor chaining calling one constructor from another
package MethodOverriding;


  abstract class Animaly{  
	  void eat(){System.out.println("animal is eating...");}  
	}  
	  
	class Dogy extends Animaly{  
	void eat(){System.out.println("dog is eating...");}  
	  
	 public static void main(String args[]){  
	  Animaly a=new Dogy();  //runtime
	  a.eat();  
	 }  
	}  
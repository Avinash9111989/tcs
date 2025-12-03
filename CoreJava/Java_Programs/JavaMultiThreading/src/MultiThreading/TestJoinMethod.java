package MultiThreading;

class TestJoinMethod extends Thread{ 
	TestJoinMethod(String name){
		super(name);
	}
	 public void run(){    
	  for(int i=1;i<=5;i++){    
	   try{    
	    Thread.sleep(500);    
	   }catch(Exception e){System.out.println(e);}    
	  System.out.println(i+" "+currentThread().getName());    
	  }    
	 }    
	public static void main(String args[]){    
	 TestJoinMethod t1=new TestJoinMethod("Keshav");    
	 TestJoinMethod t2=new TestJoinMethod("Ajay");    
	 TestJoinMethod t3=new TestJoinMethod("Dasharath");    
	 t1.start();
	 t3.start();
	 try{    
		  t1.join();
		 }catch(Exception e){System.out.println(e);}    
		
	 t2.start(); 
	   
	 }    
	}    
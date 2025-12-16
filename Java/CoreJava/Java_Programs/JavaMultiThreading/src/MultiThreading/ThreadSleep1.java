package MultiThreading;

class ThreadSleep1 extends Thread{    
	 public void run(){    
	  for(int i=1;i<5;i++){   
	  // the thread will sleep for the 500 milli seconds   
	    try{
	    	Thread.sleep(5000);
	    	}catch(InterruptedException e){System.out.println(e);}    
	    System.out.println(i);    
	  }    
	 }    
	 public static void main(String args[]){    
		 ThreadSleep1 t1=new ThreadSleep1();    
		 ThreadSleep1 t2=new ThreadSleep1();    
	     
	  t1.start();    
	  t2.start();    
	 }    
	}  

package MultiThreading;

public class ThreadSuspend extends Thread  
{    
    public void run()  
    {    
        for(int i=1; i<5; i++)  
        {    
            try  
            {  
                // thread to sleep for 500 milliseconds  
                 sleep(500);  
                 System.out.println(Thread.currentThread().getName());    
            }catch(InterruptedException e){System.out.println(e);}    
            System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {    
        // creating three threads   
    	ThreadSuspend t1=new ThreadSuspend ();    
    	ThreadSuspend t2=new ThreadSuspend ();   
    	ThreadSuspend t3=new ThreadSuspend ();   
        // call run() method   
        t1.start();  
        t2.start();  
        // suspend t2 thread   
        t2.suspend();   
        // call run() method   
        t3.start();  
        t2.resume();
    }    
}  
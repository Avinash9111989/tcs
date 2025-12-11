package GarbageCollector;

//Java program to demonstrate requesting
//JVM to run Garbage Collector
public class GC1
{
	public static void main(String[] args) throws InterruptedException
	{
		GC1 t1 = new GC1();
		GC1 t2 = new GC1();
		
		// Nullifying the reference variable
		t1 = null;
		
		// requesting JVM for running Garbage Collector
		System.gc();
		
		// Nullifying the reference variable
		t2 = null;
		
		// requesting JVM for running Garbage Collector
		Runtime.getRuntime().gc();
	
	}
	
	@Override
	// finalize method is called on object once
	// before garbage collecting it
	protected void finalize() throws Throwable
	{
		System.out.println("Garbage collector called");
		System.out.println("Object garbage collected : " + this);
	}
}

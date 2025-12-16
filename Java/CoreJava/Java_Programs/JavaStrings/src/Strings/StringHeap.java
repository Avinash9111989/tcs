package Strings;

public class StringHeap {
 public static void main(String[] args)  
	    {  
	        // S1 refers to Object in the Heap Area  

	        String s1 = new String("abc"); // Line-1  

	        // S2 now refers to Object in SCP Area  

	        String s2 = s1.concat("abc"); // Line-2  

	        // S3 refers to Object in SCP Area 

	        String s3 = s2.intern(); // Line-3  

	        System.out.println(s2 == s3);  

	        // S4 refers to Object in the SCP Area  

	        String s4 = "abcabc"; // Line-4  

	        System.out.println(s3 == s4);  
	// String s1 = new String("hello").intern();
//	 String s2 = new String("hello");
//	 String s3="hi";
//	 String s4="hi";
//	 System.out.println(s1==s2);
//	 System.out.println(s3==s4);
	    }  
}


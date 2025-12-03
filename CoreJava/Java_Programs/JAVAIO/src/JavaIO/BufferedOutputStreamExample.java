package JavaIO;
//Java BufferedOutputStream class is used
//for buffering an output stream. 
//It internally uses buffer to store data. 
//It adds more efficiency than to write data 
//directly into a stream. 
//So, it makes the performance fast.
import java.io.*;  
public class BufferedOutputStreamExample{    
public static void main(String args[])throws Exception{    
     FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
     BufferedOutputStream bout=new BufferedOutputStream(fout);    
     String s="Welcome.";    
     byte b[]=s.getBytes();    
     bout.write(b);    
     bout.flush();    
     bout.close();    
     fout.close();    
     System.out.println("success");    
}    
}  

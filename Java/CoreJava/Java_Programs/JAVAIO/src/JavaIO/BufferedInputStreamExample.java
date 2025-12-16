package JavaIO;
//Java BufferedInputStream class is used 
//to read information from stream. It internally 
//uses buffer mechanism to make the performance fast.
import java.io.*;  
public class BufferedInputStreamExample{    
 public static void main(String args[]){    
  try{    
    FileInputStream fin=new FileInputStream(args[0]);    
    BufferedInputStream bin=new BufferedInputStream(fin);    
    int i;    
    while((i=bin.read())!=-1){    
     System.out.print((char)i);    
    }    
    bin.close();    
    fin.close();    
  }catch(Exception e){System.out.println(e);}    
 }    
}  
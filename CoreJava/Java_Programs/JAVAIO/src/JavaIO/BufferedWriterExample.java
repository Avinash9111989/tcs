package JavaIO;

import java.io.*;  
public class BufferedWriterExample {  
public static void main(String[] args) {
	try {
	FileWriter writer = new FileWriter("D:\\testout.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("Welcome.");  
    buffer.close();  
    System.out.println("Success");  
    }  catch(Exception e) {
    	e.printStackTrace();
    }
}  
}
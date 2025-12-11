package JavaIO;
//Java FileInputStream class obtains input bytes 
//from a file
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;  
public class FileInputStreamExample {  
     public static void main(String args[]) throws IOException{  
    	
          try( FileInputStream fin=new FileInputStream("D:\\testout.txt");){    
           
            int i=0;    
            while((i=fin.read())!=-1){    
             System.out.print((char)i);    
            }    
              
          }catch(Exception e){System.out.println(e);}
          
         }    
        }  

package JavaDateTime;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;    

public class CurrentDateTimeExample {    
  public static void main(String[] args) {    
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
   System.out.println(dtf.format(now));  
   
   SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
   Date date = new Date();  
   System.out.println(formatter.format(date));  
   
   System.out.println(java.time.LocalDate.now());  
   
  // System.out.println(java.util.Date.);  
   System.out.println(java.time.LocalDateTime.now());  
  
   System.out.println(java.time.Clock.systemUTC().instant());  

   java.util.Date date1=new java.util.Date();  
   System.out.println(date1);
   

  }    
}    
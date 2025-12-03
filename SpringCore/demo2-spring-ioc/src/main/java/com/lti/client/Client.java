package com.lti.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.service.BillService;
import com.lti.service.ReportService;
/**
 * The Class Client.
 */
public class Client{
   
    public static void main(String[] args) {
    	
      
        
        //ApplicationContext container is instantiated by loading the configuration from config.xml available in application classpath
       AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Accessing bean with id “reportService" and typecast from Object type to ReportService type
        ReportService reportService1 = (ReportService) context.getBean("reportService1");
        BillService billService=(BillService) context.getBean("billService");

        reportService1.display();
        billService.display();
       context.close();
    }

}
package com.evolvus.SpringPro1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
        Employee emp1=(Employee) ctx.getBean("emp1");
        System.out.println("------USING SETTER INJECTION------");
        
        System.out.println("-------name-------");
        System.out.println(emp1.getName());
        System.out.println("--------Phone-----");
        System.out.println(emp1.getPhones());
        System.out.println("---------courses------");
        System.out.println(emp1.getCourse());
        System.out.println("----------Address-------");
        System.out.println(emp1.getAddress());
        
        
    }
}

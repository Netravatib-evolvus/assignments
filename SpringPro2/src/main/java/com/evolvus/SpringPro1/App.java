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
        System.out.println( "Hello World!" );
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("-----Constructor Injection-------------");
        Employee emp1=(Employee) ctx.getBean("emp1");
        System.out.println(emp1.getName());
        System.out.println(emp1.getPhones());
        System.out.println(emp1.getCourse());
        System.out.println(emp1.getAddress());
        
    }
}

package com.evolvus.SpringPro5;

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
        Vehicle vehi=(Vehicle) ctx.getBean("vehicle");
        vehi.Wheel();
        
    }
}

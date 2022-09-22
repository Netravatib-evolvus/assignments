package com.evolvus.SpringPro3;

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
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
        Student stu1=(Student) ctx.getBean("ob");
        System.out.println("Singleton Scope");
        System.out.println("Student 1st object hashcode  :" +stu1.hashCode());
        Student stu2=(Student) ctx.getBean("ob");
        System.out.println("Student 2nd object hashcode  :"+stu2.hashCode());
        Student stu3=(Student) ctx.getBean("ob");
        System.out.println("Student 3rd object hashcode  :"+stu3.hashCode());
        
    }
}

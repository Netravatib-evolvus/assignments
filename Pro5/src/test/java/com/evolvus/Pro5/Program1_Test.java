package com.evolvus.Pro5;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.MethodOrderer.MethodName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;



import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(value=MethodName.class)
public class Program1_Test {
	
	private Program1 service;
	private float actual=0.0f;
	
	@BeforeEach()
	
	public void setUp(){
		System.out.println("Program1 proogram");
		service=new Program1();
	//	 actual=service.calcSimpleInterestAmount(10000, 2, 12);
	}
	
	@Test
	@Order(0)
	@DisplayName("Test1")
	public void testcalSimpleInterestAmountSmallNumber()
	{
		
		Program1 pr1=new Program1();
		float actual=pr1.calcSimpleInterestAmount(10000, 2, 3);
		float expected=60000.0f;
       Assertions.assertEquals(expected,actual,"may be results is not matched");		
	}
	
	
	@Test
	@Order(1)
	@DisplayName("Test2")
	public void testcalSimpleInterestAmountBigNumber()
	{
		Program1 pr1=new Program1();
		float actual=pr1.calcSimpleInterestAmount(1000000, 2, 3);
		float expected=6000000.0f;
       Assertions.assertEquals(expected,actual);		    
	}
	
	@Test
	@Order(2)
	@DisplayName("Test3")
	public void testSmallNumber()
	{
	//	Program1 pr1=new Program1();
		float actual=service.calcSimpleInterestAmount(10000, 2, 12);
		float expected=240004.123f;
		Assertions.assertEquals(expected, actual,5.0);
			
	}
	
	@Test
	@Order(-10)
	@DisplayName("Test4")
	public void testSmallNumberWithTimer()
	{
		Program1 pr1=new Program1();
		assertTimeout(Duration.ofMillis(200000),
				()->
		{
			pr1.calcSimpleInterestAmount(10000, 2, 3);
		}				
				);					
	}
	
	
	
	@AfterEach
	public void clear()
	{
		System.out.println("Program1_Test.clear()");
		service=null;
	}
	
}

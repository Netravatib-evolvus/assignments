package com.evolvus.Pro5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;


public class Census_Service_Test {
	
	//@Test
	@DisplayName("testing data export")
	@RepeatedTest(value=10)
	public void testExportData()
	{
		CensusService c1=new CensusService();
		System.out.println("Census_Service_Test.testExportData()");
		
		Assertions.assertEquals("data exported",c1.exportData());		
	}
	@ParameterizedTest
	@ValueSource(ints={10,21,34,56,87})
	public void testIsOdd(int n)
	{
		System.out.println("Census_Service_Test.testIsOdd()");
		CensusService c1=new CensusService();
		Assertions.assertTrue(c1.isOdd(n));	
	}
	
	@ParameterizedTest
	@ValueSource(ints={10,21,34,56,87})
	public void testIsOdd1(int n)
	{
		System.out.println("Census_Service_Test.testIsOdd()");
		CensusService c1=new CensusService();
		Assertions.assertFalse(c1.isOdd(n));	
	}
	
	@ParameterizedTest
	@ValueSource(strings={"raja","rani"})
	public void sayHello(String user)
	{
		CensusService c1=new CensusService();
		System.out.println("Census_Service_Test.sayHello()");
		
		Assertions.assertEquals("Hello"+user,c1.sayHello(user));		
	}
	
	@ParameterizedTest
	@ValueSource(strings={"raja","rani"})
	public void sayHello1(String user)
	{
		CensusService c1=new CensusService();
		System.out.println("Census_Service_Test.sayHello()");
		
	assertEquals("Hello"+user,c1.sayHello(user));		
	}
	
	@ParameterizedTest
	//@ValueSource(strings={"","rani",""," "})
	//@EmptySource
	//@NullSource
	@NullAndEmptySource	
	public void isEmpty(String name)
	{
		CensusService c1=new CensusService();
		
	assertTrue(c1.isEmpty(name));;		
	}
	
	
}

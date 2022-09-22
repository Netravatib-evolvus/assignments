package com.evolvus.Pro5;

public class Program1 {
	public float calcSimpleInterestAmount(float pAmt,float rate,float time)
	{
		System.out.println("Program1.calcSimpleInterestAmount(-,-,-)");
		if(pAmt<=0||rate<=0||time<=0)
			throw new IllegalArgumentException("Invalid inputs");
		try {
		Thread.sleep(30);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return pAmt*rate*time;
	}

}

package com.soecode.lyf;

import java.util.concurrent.atomic.AtomicInteger;

public class CountDownLatchTest 
{
	private AtomicInteger number;

	public CountDownLatchTest(int count) {
		this.number = new AtomicInteger(count);
	}
	
	public void await()
	{
		while(number.get()!=0)
		{
			
		}
	}
	
	public void countDown()
	{
		number.getAndDecrement();
	}
}

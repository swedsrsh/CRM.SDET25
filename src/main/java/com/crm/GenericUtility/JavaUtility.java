package com.crm.GenericUtility;

import java.util.Random;

public class JavaUtility {

	
	public int getRandomNo()
	{
		Random random = new Random();
		
			int randono=random.nextInt(10000);
			return randono;
	}
	
}

package com.crm.pack;

import org.testng.annotations.Test;

public class failedgetDataFromcommandLineTest {

	@Test	
  public void commandlineTest() {
	  String url = System.getProperty("url");
	 String username = System.getProperty("username");
	 String password = System.getProperty("password");
	 
	 System.out.println(url);
	 System.out.println(username);
	 System.out.println(password);
	 
	}
}
// for this am intentionally doing fail for testing failed test case 

	//u should run (operate) in command prompt not here 
	 //cd C:\Users\Lenovo\eclipse-workspace\com.crm.SDET25
	 //(copy pest the location like right click on project - property- resources- copy the location) 
	 //mvn test -Durl=http://localhost:8888 -Dusername=admin -Dpassword=admin (give this and check build is passed or fail)
	 
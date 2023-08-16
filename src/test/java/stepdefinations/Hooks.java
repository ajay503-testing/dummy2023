package stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Hooks {

	
	@BeforeAll
	public static void before_all()
	{
		System.out.println("extentreport");
	}
	
	@Before
	public void setUp() {
		
		System.out.println("launch browser");
	}

   @After
   public void tearDown()
   {
   System.out.println("close browser");
}
   
	@AfterAll
	public static  void after_all()
	{
		System.out.println("extentreport is closed");
	}
	
	
	 
}



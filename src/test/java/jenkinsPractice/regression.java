package jenkinsPractice;

import org.testng.annotations.Test;

public class regression {

	@Test
	public void regTest1()
	{
		System.out.println("Reg1 test executed");
	}
	
	@Test
	public void regTest2()
	{
		System.out.println("Reg2 test executed");
	}
	
	@Test
	public void test3()
	{
		String BROWSER = System.getProperty("browser");
		String ENV = System.getProperty("url");
		System.out.println("Browser --> "+BROWSER+" Env -->"+ENV);
	}
}

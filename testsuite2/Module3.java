package testsuite2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Module3 {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is Before Suite Module 3 ");
		System.out.println("*************************************");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is After Suite Module 3  ");
		System.out.println("*************************************");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is Before Test Module 3 ");
		System.out.println("*************************************");
	}
	

	@AfterTest
	public void afterTest() {
		System.out.println("This is After Test Module 3 ");
		System.out.println("*************************************");
	}
	
	@Test
	public void test001() {
		System.out.println("This is test001 method Module3 ");
	}
	
	@Test
	public void test002() {
		System.out.println("This is test002 method Module3 ");
	}
	
	@Test (groups = {"smoke","sanity"})
	public void test003() {
		System.out.println("This is test003 method Module3 ");
	}
}

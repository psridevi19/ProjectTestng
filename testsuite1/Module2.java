package testsuite1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Module2 {
	
	/*
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is Before class in Module2");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is After Class in Module2");
		System.out.println("***********************************");
		System.out.println();
	}
	*/
	
	@BeforeMethod
	 public void beforeMethod(){
		System.out.println("This is beforeMethod Module2 ");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is After Method in Module2");
	}
	@Test
	public void test001(){
		System.out.println("This is Moudle2 test001 testcase");
	}
	@Test
	public void test002(){
		System.out.println("This is Moudle2 test002 testcase");
	}
	@Test
	public void test003(){
		System.out.println("This is Moudle2 test003 testcase");
	}
}

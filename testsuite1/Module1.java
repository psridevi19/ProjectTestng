package testsuite1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Module1 {
	
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is Before Suite  ");
		System.out.println("*************************************");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is After Suite  ");
		System.out.println("*************************************");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is Before Test  ");
		System.out.println("*************************************");
	}
	

	@AfterTest
	public void afterTest() {
		System.out.println("This is After Test  ");
		System.out.println("*************************************");
	}
	

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is Before class in Module1");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is After Class in Module1");
		System.out.println("***********************************");
		System.out.println();
	}
	@BeforeMethod
	 public void beforeMethod(){
		System.out.println("This is beforeMethod Module1 ");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is After Method in Module1");
	}
	
	@AfterGroups (groups = {"sanity"})
	public void afterGroupsSanity() {
		System.out.println("This is After Groups Sanity in Module1");
	}
	@BeforeGroups (groups = {"sanity"})
	public void beforeGroupsSanity() {
		System.out.println("This is Before Groups Sanity in Module1");
	}
	
	@AfterGroups (groups = {"smoke"})
	public void afterGroupsSmoke() {
		System.out.println("This is After Groups Smoke in Module1");
	}
	@BeforeGroups (groups = {"smoke"})
	public void beforeGroupsSmoke() {
		System.out.println("This is Before Groups Smoke in Module1");
	}
	
	
/*	//Not Working
	@AfterGroups
	 public void afterGroups(){
		System.out.println("This is AfterGroups Module1 ");
		System.out.println("*********************");
	}
*/
	
	@DataProvider
	public Object[][] data001(){
		Object[][] data = {{"hello","password1"},{"hi","password2"}};
		return data;
	}
	
	@Test (groups = {"smoke","sanity"})
	 public void test001(){
		System.out.println("This is Moudle1 test001 testcase");
		Reporter.log("This is Moudle1 test001 testcase");
	}
	
	@Test (dependsOnMethods = {"test003"},groups = {"smoke"})
	 public void test002(){
			System.out.println("This is Moudle1 test002 testcase");
			Reporter.log("This is Moudle1 test002 testcase");
		}
	
	
	@Test (priority = 2,groups = {"smoke"})
	 public void test003(){
			System.out.println("This is Moudle1 test003 testcase");
			Reporter.log("This is Moudle1 test003 testcase");
			//Assert.assertEquals(true, false);
		}
	
	@Test (priority = 1)
	 public void test004(){
		System.out.println("This is Moudle1 test004 testcase");
		Reporter.log("This is Moudle1 test004 testcase");
	}
	

	
	@Parameters({"fname","lName","age"})
	@Test
	public static void userDetails(String firstname, String lastName, int age)
	{
		System.out.println("FirstName : "+firstname);
		System.out.println("LastName : "+lastName);
		System.out.println("Age : "+age);
	}
	
	@Parameters("fname")
	@Test
	public static void user(String firstName)
	{
		System.out.println("FirstName : "+firstName);
	}
	
	@Test (dataProvider = "data001")
	public void login(String username, String password)
	{
		System.out.println("This is login method Module 1");
		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
	}
	

	
}

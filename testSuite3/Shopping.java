package testSuite3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Shopping {
	
	WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aadhiran/Documents/AProjectWorkspace/Project_Automation_Sel_Eclipse/AutomationSeleniumNumpy/Selenium_Project/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php");
	}

	@Test
	public void shoppingVerification()
	{
		driver.findElement(By.xpath("//img[@title='iPhone']")).click();
		WebElement inputQuantity = driver.findElement(By.id("input-quantity"));
		inputQuantity.clear();
		inputQuantity.sendKeys("2");
		WebElement buttonCart = driver.findElement(By.id("button-cart"));
		buttonCart.click();
		WebElement alert = new WebDriverWait(driver, Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='product-product']/div[contains(text(),'Success:')]")));
		//WebElement alert = driver.findElement(By.xpath("//div[@id='product-product']/div[contains(text(),'Success:')]"));
		System.out.println("Alert Message: "+alert.getText());
		Reporter.log("Alert Message: "+alert.getText());
	}
	
	
}

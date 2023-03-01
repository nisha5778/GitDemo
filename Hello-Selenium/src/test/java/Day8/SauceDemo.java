package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class SauceDemo {
	
	WebDriver chromeDriver;
	
	@DataProvider
	public String[] userIDs(){
		String[] ID = {"problem_user",
						"locked_out_user",
						"standard_user",
						"performance_glitch_user"};
		return ID;
	}
	
	
	private void LoadPage() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas\\eclipse-workspace\\Hello-Selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
		chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.saucedemo.com/");
	}
	
	@Test (dataProvider="userIDs")
	public void Login(String strUserID) {
		LoadPage();
		String strPassword = "secret_sauce"; 
		
		WebElement txtLoginID = chromeDriver.findElement(By.id("user-name"));
		txtLoginID.sendKeys(strUserID);
		System.out.println(txtLoginID.getText());
		
		WebElement txtPassword = chromeDriver.findElement(By.id("password"));
		txtPassword.sendKeys(strPassword);
		System.out.println(txtPassword.getText());

		WebElement btnLogin = chromeDriver.findElement(By.id("login-button"));
		System.out.println("Button found");

		btnLogin.click();	
		chromeDriver.close();
	}
}

package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class JuiceShop {
	WebDriver chromeDriver;

	@Test
	public void OpenWebsite() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas\\eclipse-workspace\\Hello-Selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
		chromeDriver = new ChromeDriver();
		chromeDriver.get("https://juice-shop.herokuapp.com/#/login");
		ChromeOptions cOptions = new ChromeOptions();
		cOptions.addArguments("--disable-notifications");
		
	}
	
	
	public void CreateUser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas\\eclipse-workspace\\Hello-Selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
		chromeDriver = new ChromeDriver();
		chromeDriver.get("https://juice-shop.herokuapp.com/#/register");
		
		WebElement txtEmail = chromeDriver.findElement(By.xpath("//mat-label[text()='Email']"));
		txtEmail.sendKeys("nisha5778@gmail.com");
		WebElement txtPassword = chromeDriver.findElement(By.xpath("//mat-label[text()='Password']"));
		txtPassword.sendKeys("password");
		WebElement txtRPassword = chromeDriver.findElement(By.id("repeatPasswordControl"));
		txtRPassword.sendKeys("password");
		
	}
	
	 //div[text()=' Apple Juice (1000ml) ']/../../../div[2]/button
	
	
	
	@Test	
	public void Login() {
		OpenWebsite();
		WebElement txtEmail = chromeDriver.findElement(By.id("email"));
		txtEmail.sendKeys("nishuap@yahoo.com");
		WebElement txtPassword = chromeDriver.findElement(By.id("password"));
		txtPassword.sendKeys("password");
		WebElement btnLogin = chromeDriver.findElement(By.id("loginButton"));
		btnLogin.sendKeys(Keys.ENTER);
		chromeDriver.manage().window().maximize();
		chromeDriver.findElement(By.xpath("//div[@class='cc-compliance']/a")).click();
		chromeDriver.findElement(By.xpath("//span[text()='Dismiss']")).click();
	}
}

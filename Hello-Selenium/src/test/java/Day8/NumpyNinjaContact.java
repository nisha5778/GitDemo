package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NumpyNinjaContact {

	WebDriver chromeDriver;
	
	@Test
	public void TestContact() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas\\eclipse-workspace\\Hello-Selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
		chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.numpyninja.com/contact");
		
	}
	@Test
	public void test001() {
		WebElement fNameTxt = chromeDriver.findElement(By.id("input_comp-l1c0ktzj1"));
		fNameTxt.sendKeys("Nisha");
	
		WebElement lNameTxt = chromeDriver.findElement(By.id("input_comp-l1c0ku01"));
		lNameTxt.sendKeys("Paranjape");
		
		WebElement eMailTxt = chromeDriver.findElement(By.id("input_comp-l1c0ku03"));
		eMailTxt.sendKeys("nishuap@yahoo.com");
		
		WebElement phoneTxt = chromeDriver.findElement(By.id("input_comp-l1c0ku05"));
		phoneTxt.sendKeys("nishuap@yahoo.com");
		
		WebElement detailsTxt = chromeDriver.findElement(By.id("textarea_comp-l1c0ku07"));
		detailsTxt.sendKeys("enquire about....");

		WebElement sendBtn = chromeDriver.findElement(By.id("comp-l1c0ku0e3"));
		sendBtn.click();
	}
	
}

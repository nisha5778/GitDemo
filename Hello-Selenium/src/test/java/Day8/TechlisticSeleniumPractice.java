package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TechlisticSeleniumPractice {


	WebDriver chromeDriver;
	
	@Test
	public void TestContact() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas\\eclipse-workspace\\Hello-Selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
		chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
	}
	@Test
	public void test001() {
		WebElement fNameTxt = chromeDriver.findElement(By.name("firstname"));
		fNameTxt.sendKeys("Nisha");
	
		WebElement lNameTxt = chromeDriver.findElement(By.name("lastname"));
		lNameTxt.sendKeys("Paranjape");
		
		WebElement genderRadio = chromeDriver.findElement(By.id("sex-1"));
		genderRadio.click();// isSelected=true;
		
		WebElement detailsTxt = chromeDriver.findElement(By.id("exp-4"));
		detailsTxt.click();

		WebElement dateTxt = chromeDriver.findElement(By.id("datepicker"));
		dateTxt.sendKeys("2/5/2023");
		
		WebElement profChk1 = chromeDriver.findElement(By.id("profession-0"));
		profChk1.click();
		
		WebElement profChk2 = chromeDriver.findElement(By.id("profession-1"));
		profChk2.click();
		
		WebElement toolChk1 = chromeDriver.findElement(By.id("tool-0"));
		toolChk1.click();
		
		WebElement toolChk2 = chromeDriver.findElement(By.id("tool-2"));
		toolChk2.click();
		
		WebElement continentOpt = chromeDriver.findElement(By.id("continents"));
		continentOpt.sendKeys("ricaaaq");
		
		Select commands = new Select( chromeDriver.findElement(By.id("selenium_commands")));
		commands.selectByIndex(2);
		commands.selectByIndex(1);
		commands.selectByIndex(4);
		
		
		//WebElement commandsOpt1 = chromeDriver.findElement(By.id("selenium_commands"));
		//commandsOpt1.SelectByIndex (2);
		
		
		WebElement submitBtn = chromeDriver.findElement(By.id("submit"));
		submitBtn.click();
	
	}
}

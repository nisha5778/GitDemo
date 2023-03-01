package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TutorialsPoint {
	WebDriver chromeDriver;
	@Test
	public void TestContact() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas\\eclipse-workspace\\Hello-Selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
		chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		chromeDriver.manage().window().maximize();
	}
	@Test
	public void test001() {
		WebElement txtFName = chromeDriver.findElement(By.name("firstname"));
		txtFName.sendKeys("Nisha");
		WebElement txtLName = chromeDriver.findElement(By.name("lastname"));
		txtLName.sendKeys("Paranjape");
		
		WebElement radioGender = chromeDriver.findElement(By.xpath("//input[@value='Female']"));
			//(By.xpath("//div[@id='genterWrapper']/div/div[2]/input"));
		radioGender.sendKeys(Keys.SPACE);
		
		WebElement radioExp = chromeDriver.findElement(By.xpath("//input[@value='2']"));
		radioExp.sendKeys(Keys.SPACE);
		
		WebElement txtDate = chromeDriver.findElement(By.xpath("//table/tbody/tr[5]/td[2]/input"));
		txtDate.sendKeys("12/October/2022");
		
		WebElement chkTester = chromeDriver.findElement(By.xpath("//input[@value='Manual Tester']"));
		chkTester.sendKeys(Keys.SPACE);
		
		WebElement chkFlavors1 = chromeDriver.findElement(By.xpath("//input[@value='Selenium IDE']"));
		chkFlavors1.sendKeys(Keys.SPACE);
		WebElement chkFlavors3 = chromeDriver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
		chkFlavors3.sendKeys(Keys.SPACE);
		
		Select selContinent = new Select(chromeDriver.findElement(By.xpath("//select[@name='continents']")));
		selContinent.selectByIndex(2);
		
		Select selCommands = new Select(chromeDriver.findElement(By.xpath("//select[@name='selenium_commands']")));
		selCommands.selectByIndex(1);
		selCommands.selectByIndex(2);
		selCommands.selectByIndex(4);
		
		WebElement btnSubmit = chromeDriver.findElement(By.name("submit"));
		btnSubmit.click();
		//state.click();
		/*WebElement btnClose = chromeDriver.findElement
		(By.xpath("//input[@id='react-select-3-input']/../../../../div[2]/div"));
		//chromeDriver.implicitly_wait(10);
		btnClose.sendKeys(Keys.ENTER);
		
		
		
		WebElement btnPicture = chromeDriver.findElement(By.id("uploadPicture"));
		btnPicture.click();
		*/
	}
}

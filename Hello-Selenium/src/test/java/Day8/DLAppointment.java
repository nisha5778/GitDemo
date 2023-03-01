package Day8;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DLAppointment {
	static WebDriver chromeDriver;
	

	@Test
	public void OpenApptPage() {
		chromeDriver = new ChromeDriver();
		chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas\\eclipse-workspace\\Hello-Selenium\\src\\"
				+ "test\\resources\\drivers\\chromedriver.exe");
		//chromeDriver = new ChromeDriver();
		chromeDriver.get("https://public.txdpsscheduler.com/");	
	}
	
	@Test
	public void CheckAppt() throws InterruptedException {

		//chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement btnLang = chromeDriver.findElement
				(By.xpath("//body/div/div[2]/div/div/div[2]/button"));
		btnLang.click();
		
		WebElement txtFName = chromeDriver.findElement
				(By.xpath("//div[@id='app' and @class='main']/section/div/main/"
						+ "div/section/div[2]/div/div/form/div[2]/div[3]/div[2]/div/div/div/input"));	
		txtFName.sendKeys("Manas");
		WebElement txtLName = chromeDriver.findElement
				(By.xpath("//div[@id='app' and @class='main']/section/div/main/"
						+ "div/section/div[2]/div/div/form/div[2]/div[3]/div[3]/div/div/div/input"));	
		txtLName.sendKeys("Paranjape");
		
		WebElement txtDOB = chromeDriver.findElement(By.id("dob"));
		txtDOB.sendKeys("08292003");
		
		WebElement txtSSN = chromeDriver.findElement(By.id("last4Ssn"));
		txtSSN.sendKeys("4611");


		WebElement btnSubmit = 
				chromeDriver.findElement(By.xpath("//button[.='Log On']"));
		btnSubmit.click();

		WebElement btnAppt = 
				chromeDriver.findElement(By.xpath("//button[.='Existing Appointment']"));
		btnAppt.click();	

		WebElement btnRAppt = 
				chromeDriver.findElement(By.xpath("//button[.='Reschedule Appointment']"));
		btnRAppt.click();	

		
		WebElement btnAppt1 = 
				chromeDriver.findElement(By.xpath("//button[.='OK']"));
		btnAppt1.click();
		
		/*WebElement txtCityZip = 
				chromeDriver.findElement(By.xpath("//input[@id='city']"));*/
		
		WebElement txtCityZip = 
				chromeDriver.findElement(By.xpath("//div[.='Zip Code']/div/div/div/div/input"));
		txtCityZip.sendKeys("75024");

		WebElement btnOK = 
				chromeDriver.findElement(By.xpath("//button/span[text()=' Next ']"));
		btnOK.click();
		
	}
}

package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoQA {
	WebDriver chromeDriver;
	@Test
	public void TestContact() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas\\eclipse-workspace\\Hello-Selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
		chromeDriver = new ChromeDriver();
		chromeDriver.get("https://demoqa.com/automation-practice-form");
		//chromeDriver.manage().window().maximize();
		//ChromeOptions chromeOpt = new ChromeOptions();
		//chromeOpt.setPageLoadStrategy(PageLoadStrategy.EAGER);
		//chromeOpt.setAcceptInsecureCerts(true);
		//chromeOpt.setScriptTimeout(Duration.ofSeconds(30));
		//chromeOpt.setPageLoadTimeout(Duration.ofSeconds(30));
		//chromeOpt.setImplicitWaitTimeout(Duration.ofSeconds(30));
		//chromeOpt.addExtensions(new File(""));
		//chromeOpt.addArguments("--incognito");
		//chromeOpt.addArguments("start-maximized");
		//chromeOpt.addArguments("--headless");//invisible mode
	}
	@Test
	public void test001() {
		WebElement txtFName = chromeDriver.findElement(By.id("firstName"));
		txtFName.sendKeys("Nisha");
		WebElement txtLName = chromeDriver.findElement(By.id("lastName"));
		txtLName.sendKeys("Paranjape");
		WebElement txtEmail = chromeDriver.findElement(By.id("userEmail"));
		txtEmail.sendKeys("nisha@gmail.com");
		
		WebElement radioGender = chromeDriver.findElement(By.xpath("//label[text()='Female']"));
		radioGender.click();
		
		WebElement txtPhone = chromeDriver.findElement(By.id("userNumber"));
		txtPhone.sendKeys("6238632832");
		
		WebElement datePicker = chromeDriver.findElement(By.id("dateOfBirthInput"));
		datePicker.sendKeys(Keys.SPACE);

		String strYear, strMonth, strDate;
		strYear = "2025";
		strMonth="May";
		strDate="28";
		
		WebElement month = chromeDriver.findElement(By.className("react-datepicker__month-select"));
		Select monthSel = new Select(month);
		monthSel.selectByVisibleText(strMonth);
		
		
		WebElement year = chromeDriver.findElement(By.className("react-datepicker__year-select"));
		Select yearSel = new Select(year);
		yearSel.selectByVisibleText(strYear);
		
		WebElement date = chromeDriver.findElement
				(By.xpath("//div[text()='" + strDate +"' and contains(@aria-label, strMonth)]"));
		date.click();
		
		WebElement txtSubjects = chromeDriver.findElement(By.id("subjectsInput"));
		txtSubjects.sendKeys("math, science");
		System.out.println("subjects : " +txtSubjects.getText());
		
		WebElement txtAddress = chromeDriver.findElement(By.id("currentAddress"));
		txtAddress.sendKeys("Ohio Dr., Plano, TX");
		
		WebElement state = chromeDriver.findElement(By.xpath("//input[@id='react-select-3-input']"));
		state.sendKeys("NCR");
		state.sendKeys(Keys.ENTER);
		
		WebElement city = chromeDriver.findElement(By.xpath("//input[@id='react-select-4-input']"));
		city.sendKeys("Delhi");
		city.sendKeys(Keys.ENTER);
		
		WebElement chkHobby1 = chromeDriver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
		chkHobby1.sendKeys(Keys.SPACE);
		
		WebElement chkHobby3 = chromeDriver.findElement(By.xpath("//input[@id='hobbies-checkbox-3']"));
		chkHobby3.sendKeys(Keys.SPACE);
	}
}

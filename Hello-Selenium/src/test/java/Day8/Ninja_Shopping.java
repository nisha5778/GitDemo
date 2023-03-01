package Day8;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.TestNG;
import org.testng.annotations.Test;

import dev.failsafe.Timeout;
public class Ninja_Shopping {
	
	WebDriver chrome, firefox;
	
	@Test
	public void OpenApplication() {	
		System.setProperty("webdriver.chrome,driver",
				"C:\\Users\\manas\\eclipse-workspace\\Hello-Selenium\\src\\test\\resources\\drivers\\chromedriver.exe");
		chrome = new ChromeDriver();
		chrome.get("http://tutorialsninja.com/demo/index.php");	
	}
	
	@Test
	public void ChangeCurrencyToEuro() {	
		WebElement currency = chrome.findElement(By.xpath("//form[@id='form-currency']"));
		currency.click();
		currency.findElement(By.name("EUR")).click();			
	}
	
	@Test
	public void OpenIphoneDetails() {
	//open iPhone details screen
		chrome.findElement(By.xpath("//img[@title='iPhone']")).click();
		WebElement quantity = chrome.findElement(By.id("input-quantity"));
		quantity.clear();
		quantity.sendKeys("2");
		WebElement btnAdd = chrome.findElement(By.id("button-cart"));
		btnAdd.click();
		
		System.out.println("hello");
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//String strSuccess = chrome.findElement(By.xpath("//html/body/div[2]/div[1]")).getText()  ;
		String strSuccess = chrome.findElement(By.xpath("//div[contains(@class, 'alert-success')]")).getText();

		System.out.println(strSuccess);
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("after wait post success message");
		WebElement btnCart = chrome.findElement(By.xpath("//div[@id='cart']/button"));
		btnCart.sendKeys(Keys.SPACE);
		System.out.println("after cart button click and before view cart click");
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println("before view cart element search");
		
		WebElement btnViewCart = chrome.findElement
				(By.xpath("//*[@id='cart']/ul/li[2]/div/p/a[1]/strong"));
		System.out.println("after view cart element search: " + btnViewCart.getTagName());
		
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		btnViewCart.click();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println("after view cart element click ");
		
		//*[@id="checkout-cart"]/div[1]/text()
		
		//btnCart.findElement(By.xpath("//i[@class='fa fa-shopping-cart']")).click();
		//btnCart.findElement(By.xpath("//table[@class='table table-bordered']/../p/a[2]")).click();
		//WebElement btnOpenCart = chrome.findElement(By.xpath("//table[@class='table table-bordered']/../p/a/strong/i/span"));
		//btnOpenCart.click();
		//WebElement txtQuantity = chrome.findElement(By.name("quantity[164569]"));
		//txtQuantity.clear();
		//txtQuantity.sendKeys("3");
		//WebElement btnUpdate = chrome.findElement(By.xpath("//div[@class='input-group btn-block']/span/button[1]/i"));
		//btnUpdate.click();
	}
	
	@Test
	public void OpenCanonCameraDetails() {
		WebElement btnOpenCanon = chrome.findElement(By.xpath("//img[@title='Canon EOS 5D']/../../../div[3]/button/span"));
		btnOpenCanon.click();
		//WebElement btnAdd = chrome.findElement(By.className("btn btn-primary btn-lg btn-block"));
		//btnAdd.click();	
		chrome.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block']")).click();
		//String strError = chrome.findElement(By.xpath("//div[@class='text-danger']")).toString();
		//System.out.println(strError);
	}
}
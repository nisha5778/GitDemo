package Day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TutorialNinjaTest {

@Test
public void openApplication() {
		
		System.setProperty("webdriver.driver.chrome","C:\\Users\\kiran\\Desktop\\Test\\MavenClassWork\\src\\test\\resources\\driver\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
		chromeDriver.manage().window().maximize();
		chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Finding the currency dropdown in the left top corner 
		WebElement currencyDropDown=chromeDriver.findElement(By.xpath("//form[@id='form-currency']"));
		
		//Clicking on the currencydropdown
		currencyDropDown.click();
		
		//Selecting Euro from dropdown
		currencyDropDown.findElement(By.name("EUR")).click();
		
		//Finding element canon EOS 5 D camera on the webpage 
		chromeDriver.findElement(By.xpath("//a[text()='Canon EOS 5D']/../../../div[3]/button/span")).click();
		
		//Finding element add to cart on the webpage
		chromeDriver.findElement(By.xpath("//button[@id='button-cart']")).click();
		
		//Printing error message occurred due to a bug in select option.
		System.out.println(chromeDriver.findElement(By.xpath("//div[text()='Select required!']")).getText());
		
		//Wait until Home Menu bar is visible 
		WebElement elementHomeMenuBar=chromeDriver.findElement(By.xpath("//ul[@class='breadcrumb']"));
		JavascriptExecutor jsHomeMenuBar = (JavascriptExecutor)chromeDriver;
		jsHomeMenuBar.executeScript("arguments[0].scrollIntoView();", elementHomeMenuBar); 
		
		//Select Home and navigate to home screen 
		chromeDriver.findElement(By.xpath("//ul[@class='breadcrumb']/li[1]")).click();
		
		//Select iPhone from home screen
		chromeDriver.findElement(By.xpath("//img[@title='iPhone']")).click();
		
		//Find quantity text box 
		chromeDriver.findElement(By.id("input-quantity")).clear();
		
		//Change quantity to 2
		chromeDriver.findElement(By.id("input-quantity")).sendKeys("2");
		
		//Click add to cart button 
		chromeDriver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
		
		//Printing success message.
		WebElement successMessageAddtoCart=chromeDriver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		System.out.println(successMessageAddtoCart.getText());
		
		//Clicking on cart icon (black color) in the right side top
		chromeDriver.findElement(By.xpath("//span[@id='cart-total']")).click();
		  
		//Click on view cart
		chromeDriver.findElement(By.xpath("//strong[text()=' View Cart']")).click();
		  
		//Find quantity textbox & clear the textbox 
		chromeDriver.findElement(By.xpath("//div[@class='input-group btn-block']//input")).clear();
		  
		//Enter 3 in quantity textbox 
		chromeDriver.findElement(By.xpath("//div[@class='input-group btn-block']//input")).sendKeys("3");
		  
		//Click on update button
		chromeDriver.findElement(By.xpath("//button[@data-original-title='Update']")).click();
		  
		//Scroll until Checkout button is visible 
		WebElement elementCheckout=chromeDriver.findElement(By.xpath("//a[text()='Checkout']"));
		JavascriptExecutor jsCheckOut = (JavascriptExecutor)chromeDriver;
		jsCheckOut.executeScript("arguments[0].scrollIntoView();", elementCheckout);
		  
		//Print EcoTax label & value
		String ecotaxLabel= chromeDriver.findElement(By.xpath("//strong[text()='Eco Tax (-2.00):']")).getText();
		String ecoTaxvalue= (chromeDriver.findElement(By.xpath("//td//strong[text()='Eco Tax (-2.00):']/../../td[2]")).getText());
		System.out.println(ecotaxLabel +" " + ecoTaxvalue);
		
		//Print VAT label & value
		String vat20Label=chromeDriver.findElement(By.xpath("//strong[text()='VAT (20%):']")).getText();
		String vat20Value=chromeDriver.findElement(By.xpath("//td//strong[text()='VAT (20%):']/../..//td[2]")).getText();
		System.out.println(vat20Label +" "+ vat20Value);
		
		//Click on checkout
		chromeDriver.findElement(By.xpath("//a[text()='Checkout']")).click(); 
		
		//Error message at checkout iPhone
		System.out.println(chromeDriver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText());
		
		//Remove items from cart
		chromeDriver.findElement(By.xpath("//button[@data-original-title='Remove']")).click();
		
		
		//Select Home and navigate to home scr	een 
		chromeDriver.findElement(By.xpath("//ul[@class='breadcrumb']/li")).click();
		chromeDriver.findElement(By.xpath("//ul[@class='breadcrumb']/li")).click();		
		
		//Click on Macbook
		chromeDriver.findElement(By.xpath("//img[@title='MacBook']")).click();
		
		//Scroll down
		JavascriptExecutor js = (JavascriptExecutor)chromeDriver;
		js.executeScript("window.scrollTo(0,675.5555419921875)");
		//Click on Add to cart
		chromeDriver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
		
		//div[text()='Success: You have added '] Verify success message 
		
		//Click on shopping cart link
		WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(20));
		WebElement abc =chromeDriver.findElement(By.xpath("//a[text()='shopping cart']"));
		wait.until(ExpectedConditions.elementToBeClickable(abc)); 
		abc.click();
		
		//Click on coupon code
		chromeDriver.findElement(By.xpath("//a[text()='Use Coupon Code ']")).click();
		
		//Enter the coupon code
		chromeDriver.findElement(By.xpath("//input[@name='coupon']")).sendKeys("ABCD123");
		
		//Click on applybutton
		chromeDriver.findElement(By.xpath("//input[@value='Apply Coupon']")).click();
		
		//Print error message-------------??????
		System.out.println(chromeDriver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText());
		
		//Use Gift Certificate 
		chromeDriver.findElement(By.xpath("//input[@value='Apply Gift Certificate']")).click();
		
		chromeDriver.findElement(By.xpath("//input[@value='Apply Gift Certificate']")).sendKeys("AXDFGH123 ");
		
		//Clear the coupon & gift voucher code
		chromeDriver.findElement(By.xpath("//input[@value='Apply Coupon']")).clear();
		chromeDriver.findElement(By.xpath("//input[@value='Apply Gift Certificate']")).clear();
		
		}
}

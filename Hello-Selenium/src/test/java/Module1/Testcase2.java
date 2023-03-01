package Module1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

public class Testcase2 {
	@Test
	public void testMethod1() {
		System.out.println("This gets executed during test method 1!!");
	}
	@Test
	public void testMethod2() {
		System.out.println("This gets executed during test method 2!!");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This gets executed before each suite!!");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("This gets executed after each suite!!");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("This gets executed before each test!!");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("This gets executed after each test!!");
	}
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("This gets executed before each group!!");
	}
	@AfterGroups
	public void afterGroups() {
		System.out.println("This gets executed after each group!!");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("This gets executed before each class!!");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("This gets executed after each class!!");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This gets executed before each method!!");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("This gets executed after each method!!");
	}	
}

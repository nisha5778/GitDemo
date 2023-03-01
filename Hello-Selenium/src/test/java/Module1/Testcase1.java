package Module1;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testcase1 {
	
	@Test (groups = {"group1", "group2"})
	public void testcase001() {
	System.out.println("I am testcase001 1 module 1 - Testcase1");
	}

	@Test (groups = {"group2"})
	public void testcase002() {
	System.out.println("I am testcase002 module 1 - Testcase1");
	}
	
	@Test (groups = {"group1"})
	public void testcase003() {
	System.out.println("I am testcase003 module 1 - Testcase1");
	}
	
	@DataProvider 
	public String[][] dataProvider1(){
		String[][] obj1 = {{"ui1", "pwd1"},{"ui2","pwd2"},{"ui3","pwd3"}};
		return obj1;
	}
	
	
	@Test(dataProvider = "dataProvider1", groups = {"group1"})
	public void Login(String userName, String password) {
		System.out.println(userName + "--" + password);
	}
}

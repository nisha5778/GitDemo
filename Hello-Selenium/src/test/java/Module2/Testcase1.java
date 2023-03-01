package Module2;

import org.testng.annotations.Test;

public class Testcase1 {

	@Test (groups = {"group1"})
	public void testcase001() {
	System.out.println("I am testcase001 module 2 - Testcase1");
	}
	
	@Test 
	public void testcase002() {
	System.out.println("I am testcase002 module 2 - Testcase1");
	}
	
	@Test 
	public void testcase003() {
	System.out.println("I am testcase003 module 2 - Testcase1");
	}
}

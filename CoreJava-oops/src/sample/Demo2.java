package sample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
	
	@Test
	public void connect() {
		System.out.println("hi");
		Reporter.log("bye",true);
	}
	
	@Test()
	public void connect1() {
		System.out.println("hi");
		Reporter.log("bye",true);
	}

}

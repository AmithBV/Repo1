package data;

import java.util.Arrays;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Stringpgm {


	public static void main(java.lang.String[] args) {
		int n=5;
		String msg="prime";
		for (int i = 2; i <n; i++) {
			if(n%i==0) {
				msg="not prime";
				break;
			}
		}
		
		System.out.println(msg);
		
		
		}
}

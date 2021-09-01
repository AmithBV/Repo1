package data;

import java.util.Arrays;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Occurance {

	public static void main(java.lang.String[] args) {
		String str="aabbcc";
		int count=1;
		char[] c=str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = i+1; j < c.length; j++) {
				if(c[i]==c[j]) {
					c[j]=' ';
					count++;
				}
			}
			
		
		if(c[i]!=' ' && count>1) {
			System.out.println(c[i]+" "+count);
			count=1;
		}
		
		}

	}
}

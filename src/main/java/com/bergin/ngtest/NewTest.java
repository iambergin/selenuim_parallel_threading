package com.bergin.ngtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	ChromeDriver chromeDriver = null;

	@Test
	public void f() {
		System.out.println("INside Test");
		try {
			chromeDriver.get("http://iambergin.com");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\ChromeDriver\\chromedriver.exe");
		chromeDriver = new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
		chromeDriver.close();
	}

}

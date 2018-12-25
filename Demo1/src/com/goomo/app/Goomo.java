package com.goomo.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Goomo {
	public static void main(String[] args) {
		WebDriver webDriver = new FirefoxDriver();
		webDriver.get("http://www.google.com");
		webDriver.close();
	}

}

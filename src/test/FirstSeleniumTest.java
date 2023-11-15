package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {
	public static String browser;
	static WebDriver driver;
	
public static void main(String[] args) {
	setBrowser("Edge");
	runTest();
	
}
	
public static void setBrowser(String var) {
	browser = var;
		
		//Creating an driver object for Firefox 
		if(browser.contains("Firefox")) {
		//System.setProperty("webdriver.gecko.driver", "C:\\AAAA\\Selenium 4.8.1\\SeleniumTest\\lib\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
		
		//Creating an driver object for Edge
		if (browser.contains("Edge")) {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new EdgeDriver(options);	
		}
		
		//Creating an driver object for Chrome
		if(browser.contains("Chrome")) {
		//System.setProperty("webdriver.chrome.driver", "C:\\AAAA\\Selenium 4.8.1\\SeleniumTest\\lib\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		}
}
public static void runTest() {

	driver.get("https://selenium.dev/");
	System.out.println("Title is: "+driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.quit();
}
}

package headLessMode;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HtmlUnitDriverTest {

	public static void main(String[] args) throws Exception {
		
		//HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.CHROME);
		HtmlUnitDriver driver = new HtmlUnitDriver();
		
		driver.get("https://selenium.dev");
		System.out.println("Title is: "+driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
	}
}

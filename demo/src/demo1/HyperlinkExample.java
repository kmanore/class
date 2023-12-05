package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperlinkExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Open Google Chrome.
		// 2. Go to webpage https://www.selenium.dev/documentation/
		// 3. Click on hyperlink.
		
		System.setProperty("webdriver.chrome.driver","D:\\Testing Course\\Automation Testing\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/documentation/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("W3C WebDriver specification")).click();
	}

}

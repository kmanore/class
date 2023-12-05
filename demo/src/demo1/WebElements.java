package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Open Google Chrome.
		// 2. Open Google home.
		// 3. Enter the text into search box
		// 4. Press enter
		
		System.setProperty("webdriver.chrome.driver","D:\\Testing Course\\Automation Testing\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("APjFqb")).sendKeys("selenium"+Keys.ENTER);
		
		driver.findElement(By.linkText("Downloads")).click();
		
		
	
		

	}

}

package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompareResults {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Testing Course\\Automation Testing\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.co.in/");
		
		String expectedTitle ="Google";
		
		String actualTitle ="";
		
		actualTitle = driver.getTitle();
		
		System.out.println("Expected Title:"+expectedTitle);
		
		System.out.println("Actual Title:"+actualTitle);
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Test Passed");
		}
		
		else
		{
			System.out.println("Test Failed");
		}

	}

}

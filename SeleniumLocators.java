package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		//by locator id
		driver.findElement(By.id("APjFqb")).sendKeys("java");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
	    System.out.println(driver.getTitle());
	    driver.close();

		
		
	} 

}

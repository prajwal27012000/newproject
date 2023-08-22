package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("http://demo.guru99.com/test/newtours/register.php");
 driver.findElement(By.name("firstname")).sendKeys("Prajwal");
 driver.findElement(By.name("lastname")).sendKeys("Khadake");
 WebElement countryDropDown = driver.findElement(By.name("country"));
 
 //for DropDown
 Select s = new Select(countryDropDown);
 s.selectByIndex(2);
 //s.selectByVisibleText("AUSTRALIA");
 //s.selectByValue("ARGENTINA");

	}

}

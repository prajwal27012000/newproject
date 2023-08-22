package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstAutomation {
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.google.com");
		String title = driver.getTitle();
		int titleLength = title.length();
		System.out.println("Title of the Page = "+title);
		System.out.println("Length of the Title is = "+titleLength);
		String url = driver.getCurrentUrl();
	    System.out.println("Current opened url is = "+url)	;
	    driver.navigate().to("http://www.facebook.com/login/");	
	    String urlfb = driver.getCurrentUrl();
	    System.out.println("fb url i = "+urlfb);
	    driver.close();
	}

}

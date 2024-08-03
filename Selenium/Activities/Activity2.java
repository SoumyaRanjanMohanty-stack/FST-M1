package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();

	    WebDriver driver = new FirefoxDriver();
	    
	    driver.get("https://v1.training-support.net/selenium/login-form");

	    // Interactions
	    //...
	    System.out.println("The title of the page is: "+ driver.getTitle());
	    
	    driver.findElement(By.id("username")).sendKeys("admin");
	    
	    driver.findElement(By.id("password")).sendKeys("password");
	    
	    driver.findElement(By.xpath("//button[text()= 'Log in']")).click();
	    
	    System.out.println("The title of the page is: "+ driver.getTitle());
	    
	    // Close the browser
	    
	    driver.quit();
	}

}
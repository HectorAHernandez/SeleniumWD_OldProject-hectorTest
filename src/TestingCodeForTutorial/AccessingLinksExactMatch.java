package hectorTestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AccessingLinksExactMatch {
 public static void main(String[] args) { 
    	System.setProperty("webdriver.gecko.driver","C:\\selenium-3.4.0\\geckodriver.exe");
    	System.setProperty("webdriver.chrome.driver", "C:\\selenium-3.4.0\\chromedriver.exe");     	
	  	WebDriver driver = new FirefoxDriver();
//    	WebDriver driver = new ChromeDriver();
// Below code is for using Link with exact match. Note driver will take the first one when multiple match.	  	
	  	String baseUrl = "file://c:/Selenium%20Tutorial%20Code/HTML_Files/newhtml.html";
		driver.get(baseUrl);
		driver.findElement(By.linkText("click here")).click();
		System.out.println("With Exact Match, Title of page is: " + driver.getTitle());
		
// Below code is for using Link with Partial match. Note driver will take the first one when multiple match.	  	
	  	baseUrl = "file://c:/Selenium%20Tutorial%20Code/HTML_Files/partial_match.html";
		driver.get(baseUrl);
		driver.findElement(By.partialLinkText("here")).click();
		System.out.println("With Partial Match, Title of page is: " + driver.getTitle());

// Below code is for using Link with Partial match on case sensitive link.	  	
	  	baseUrl = "http://newtours.demoaut.com/";
		driver.get(baseUrl);
		String theLinkText = driver.findElement(By.partialLinkText("egis")).getText();
		System.out.println("With Partial Match, lowercase link is: " + theLinkText);
		theLinkText = driver.findElement(By.partialLinkText("EGIS")).getText();
		System.out.println("With Partial Match, UPPERCASE link is :" + theLinkText);
		
		driver.quit();
 }
 /* This is a testing branch created for testing the new Tax Plan.
 And I have added another line for the second commit.
 My third line for third commit. Me

My name is Hector Hernandez AMPARO
I am enjoying learning Change control with Github.
After high school I want to be a Zim Benefactor.
Because this is my favorite thing to do.


A new line only in master branch.


  */

}
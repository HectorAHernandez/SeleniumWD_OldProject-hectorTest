package hectorTestPackage;

import java.util.List;     // to work with the list 
import java.util.concurrent.TimeUnit;  // to define the wait time of 5 seconds.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinksInAPageValidation {
 public static void main(String[] args) { 
    	System.setProperty("webdriver.gecko.driver","C:\\selenium-3.4.0\\geckodriver.exe");
    	System.setProperty("webdriver.chrome.driver", "C:\\selenium-3.4.0\\chromedriver.exe");  
//	  	WebDriver driver = new FirefoxDriver();
//    	WebDriver driver = new ChromeDriver();

    	String baseUrl = "http://newtours.demoaut.com/";
        WebDriver driver = new FirefoxDriver();
        String underConsTitle = "Under Construction: Mercury Tours"; // Title of the error page when link not implemented
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // Define the time to wait, 5 seconds, after clicking the link.

        driver.get(baseUrl);
        List<WebElement> hectorLinkElements = driver.findElements(By.tagName("a")); // Create a list of WebElements containing all the LINK elements in the page.
        String[] array_linkTexts = new String[hectorLinkElements.size()]; // Create an String array, linkTexts, the size of the LINK elements list.

        int i = 0;
        //extract the link texts of each link element
        for (WebElement e : hectorLinkElements) {   //this is a foreach structure that define "e" a WebElement and in the loop access all the elements in the list until end.
            array_linkTexts[i] = e.getText();   // assign the text of each link element to the array.
            i++;
        }

        //list all the link moved
        for (String ws_link : array_linkTexts) {       // another foreach loop
             System.out.println("\"" + ws_link + "\"" + " is one of the link.");
             }   

        
        for (int j = 0; j < hectorLinkElements.size(); j++) {
        	WebElement  element = driver.findElements(By.tagName("a")).get(j); //assign the linkElement(j) to the ws_element WebElement.
        	String linkText = element.getText();   //copy the text of the ws_element to the linkText string varialbe
        	System.out.println("\"" + linkText + "\"" + " ******** link to Test."); // to see the link before the error on "Register here"
        	element.click();  // click on the link save in the element webElement.
            if (driver.getTitle().equals(underConsTitle)) {  // verify if the link is under construction.
                System.out.println("\"" + linkText + "\""
                        + " is under construction.");
            } else {
                System.out.println("\"" + linkText + "\""
                        + " is working.");
            }
            driver.navigate().back();
        }
        driver.close();       
    }
}    	
//for (String t : linkTexts) {       // another foreach loop
//	System.out.println("\"" + t + "\"" + " ******** link to Test."); // to see the link before the error on "Register here"
// //   driver.findElement(By.linkText(t)).click();  // click on each link in the page.
//    driver.findElement(By.partialLinkText(t)).click();  // click on each link in the page.
//    if (driver.getTitle().equals(underConsTitle)) {  // verify if the link is under construction.
//        System.out.println("\"" + t + "\""
//                + " is under construction.");
//    } else {
//        System.out.println("\"" + t + "\""
//                + " is working.");
//    }
//    driver.navigate().back();
//}
    	
package hectorTestPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookPage {
    public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver","C:\\selenium-3.4.0\\geckodriver.exe");
    	System.setProperty("webdriver.chrome.driver", "C:\\selenium-3.4.0\\chromedriver.exe");
//    	driver = new ChromeDriver();
//    	driver = new FirefoxDriver();
    	WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://www.facebook.com";
        String tagName = "";
        
        driver.get(baseUrl);
        tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println("***** Tag name for email is: "+tagName);
//locates elements based on the value of the name attribute:
        tagName = driver.findElement(By.name("pass")).getTagName();
        System.out.println("***** find elements based on the value of the name attribute, Tag name for password is: "+tagName);
//locates elements based on the value of a "id" attribute:
        tagName = driver.findElement(By.id("month")).getTagName();
        System.out.println("***** find elements based on the value of a id attribute, Tag name for month is: "+tagName);
        tagName = driver.findElement(By.name("websubmit")).getTagName();
        System.out.println("***** Tag name for Create Account button is: "+tagName);
//find elements based on the value of a "class" attribute:
        tagName = driver.findElement(By.className("inputtext")).getTagName();
        System.out.println("***** find elements based on the value of a class attribute,Tag name is: "+tagName);
//find elements based on the driver's underlying CSS selector engine, using id:
        tagName = driver.findElement(By.cssSelector("input#u_0_e")).getTagName();
        System.out.println("***** find elements based on the driver's underlying CSS selector engine, Tag name is: "+tagName);
//find a link elements by the exact text it displays,:
        tagName = driver.findElement(By.linkText("Facebook")).getTagName();
        System.out.println("***** find a link elements by the exact text it displays, Facebook link, Tag name is: "+tagName);
//Locates the elements that contain the PARTIAL link text,:
        tagName = driver.findElement(By.partialLinkText("book")).getTagName();
        System.out.println("***** Locate the elements that contain the PARTIAL link text, Facebook link, Tag name is: "+tagName);
//Locates the elements by their tag name,:
        tagName = driver.findElement(By.tagName("Div")).getTagName();
        System.out.println("***** Locate their Tag Name, Tag Div, Tag name is: "+tagName);       
//Locates elements via XPath:
        tagName = driver.findElement(By.xpath("//html/body/div[1]/div[2]/div[1]/div/div/div/div/div[2]/h2")).getTagName();
        System.out.println("***** Locates elements via XPath, For Sing Up header, Tag name is: "+tagName);       
// Instantiating WebElements to access a particular element without using the "driver.findElement(By.locator())"  
        WebElement HectorElement = driver.findElement(By.id("email"));
        HectorElement.sendKeys("hectorTest@gmail.com");
        System.out.println("***** Content of instantiated WebElement HectorElement is: "+HectorElement.getAttribute("value"));
        System.out.println("***** Content of original element  email is: "+driver.findElement(By.id("email")).getAttribute("value"));
// To refresh the current page.
//        driver.navigate().refresh();
// Getting the title of the current page.
        System.out.println("***** The Title of the current page is : "+driver.getTitle());
// Getting the page source code of the current page.
//        System.out.println("***** The Source code of the current page is : "+driver.getPageSource());
// Getting the current URL that the browser is looking at.
      System.out.println("***** The current URL that the browser is looking at is : "+driver.getCurrentUrl());

// Clicking on an Element:
      driver.findElement(By.id("loginbutton")).click();  
// To navigate Back one page on the browser history
      driver.navigate().back();
// To navigate Forward one page on the browser history
//      driver.navigate().forward();
      
// To close ONLY the browser window that WebDriver is currently controlling use the close() method.
    driver.close();
// To close ALL the browser windowsthat WebDriver has opened use the quit() method.
//      driver.quit();
      
     System.exit(0);
}
}

package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class FormFillUp_Chrome {
public static void main(String[] args) {
	String urlString = "http://www.training.qaonlinetraining.com/testPage.php";
    WebDriver driver;
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    // opening website for form fill up
    driver.get(urlString);
    
    // sending text to the input box in the web form--------------
    // filling the name section
    driver.findElement(By.name("name")).sendKeys("DemoName");
 
    // E mail section
    driver.findElement(By.name("email")).sendKeys("DemoEmail@demo.com");
    
    // Website section
    driver.findElement(By.name("website")).sendKeys("www.demosite.com");
    
    // Comment section
    driver.findElement(By.name("comment")).sendKeys("demo comment");
    
    //Click on Send Button
    driver.findElement(By.name("submit")).click();
   
}
}

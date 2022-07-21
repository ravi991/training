package slenium_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		// Create object of WebDriver class
		 WebDriver driver;
	        
		// setProperty method is used to set the path of driver from system location
	        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// Intialize value to the driver
	        driver = new ChromeDriver();
		
		// pass the link of driver
	     	 driver.get("https://www.itlearn360.com/");
	        int count = 0;
	        // Counting links of itlearn360 site , located by tagName
	        // using Findelements
	        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	        for (WebElement link : allLinks) {
	            // print the each url 
	            System.out.println(link.getAttribute("href"));
			// the number of link keep counting along with loop
	            count ++;
	            
	        }
		// Print the total numbers of links
	        System.out.println("total number of links present: "+count);
		
		// close the driver
	        driver.close();
	}

}

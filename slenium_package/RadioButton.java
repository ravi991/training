package slenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
        WebDriver driver = new ChromeDriver();
	        driver.get("http://training.qaonlinetraining.com/testPage.php");
	        // now we will save the Web element radio in one object and perform click action
	        //radio option female
	        WebElement radioButtonFemale = driver.findElement(By.xpath("//input[@value='female']"));
//	        radio option male
	        WebElement radioButtonMale = driver.findElement(By.xpath("//input[@value='male']"));
//	        radio option Other
	        WebElement radioButtonOther = driver.findElement(By.xpath("//input[@value='Other']"));
	        // submit button
	        WebElement submitButton = driver.findElement(By.xpath("//input[@value='Send']"));

	        radioButtonFemale.click();
	        Thread.sleep(6000);
	        radioButtonMale.click();
	        submitButton.click();
	}

}
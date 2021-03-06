package slenium_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		//using linktext
		driver.findElement(By.linkText("My Account")).click();
		//enter login details
		driver.findElement(By.id("username")).sendKeys("practest77");
		driver.findElement(By.id("password")).sendKeys("Basictes12!");
				//click login
		driver.findElement(By.name("login")).click();
		driver.findElement(By.partialLinkText("Account D")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Addresses")).click();
		driver.findElement(By.xpath("//a[contains(@class,'edit')]")).click();
		driver.findElement(By.id("billing_first_name")).sendKeys("Practice");
		driver.findElement(By.id("billing_last_name")).sendKeys("Test");
		
		By locate=By.xpath("//input[contains(@id,'billing_email')]");
		/*WebElement email=driver.findElement(By.xpath("//input[contains(@id,'billing_email')]"));
		email.clear();
		email.sendKeys("practest77@gmail.com");*/
		
		driver.findElement(locate).clear();
		driver.findElement(locate).sendKeys("practest77@gmail.com");
		driver.findElement(By.id("billing_phone")).sendKeys("12345");
		
		 WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement  ele= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"select2-drop-mask\"]")));
//		driver.switchTo().frame(0);
		Select countryname=new Select(ele);
//		WebElement country=driver.findElement(By.id("billing_country"));
		
		countryname.selectByVisibleText("Aruba");
		
		
		
		
		//driver.findElement(By.xpath("//input[@placeholder='Street address')]")).sendKeys("12 abcd");
		driver.findElement(By.id("billing_address_1")).sendKeys("12 abcd");
		driver.findElement(By.id("billing_city")).sendKeys("Delhi");
		//Select a=new Select(driver.findElement(By.id("select2-drop-mask")).findElement(By.id("s2id_autogen6729_search")));
		//System.out.println(a);
		//a.selectByVisibleText("Delhi");
		//Select a=new Select(driver.findElement(By.xpath("//div[@id='select2-drop-mask']")));
		//a.selectByVisibleText("Delhi");
		driver.findElement(By.id("billing_postcode")).sendKeys("123");
		

	}

}

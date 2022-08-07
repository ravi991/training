// In this testng code, we are trying to pass mutiple login data using DataProviders 
// Steps to perform 
// 1. Create a dataProvider method. In dataProvider method the return time of the method is array and values are returned in form of array.
 // 2.Return values of email,password and message mutiple times using array.So everytime you are calling the dp method it will return all value one
// by one .That means this code will rum 3 times
// 3. Add @DataProvider to the method 
// 4. Now in method checking the @Test is passed along with the dataProvider keyword and the dataprovider method name dp
// 5. setup the property of chromedriver because we will perform testing of login process through chrome web browser.
// 6. Get reference of Email input box by locate the id method.
// 7. Get reference of Password input box by locate the id method.
// 8. Get reference of login button by locate the classname method.
// 9. Clear the Email input box.
// 10. Provide/Enter the correct email to email input box through reference.
// 11. Clear the Password input box.
// 12. Provide/Enter the correct password to password input box through reference.
// 13. Click Submit the button.
package testngPackage;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
	WebDriver browserDriver;
	// 4. Now in method checking the @Test is passed along with the dataProvider keyword and the dataprovider method name dp
	 @Test(dataProvider = "dp")
	    public void checking(String userName, String passWord, String msg) throws InterruptedException {
		    // 5. setup the property of chromedriver because we will perform testing of login process through chrome web browser.
	        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	        // create object name driver of type ChromeDriver
	        browserDriver = new ChromeDriver();
		   
	        browserDriver.get("https://admin-demo.nopcommerce.com/login");
		     // 6. Get reference of Email input box by locate the id method.
	        WebElement username = browserDriver.findElement(By.name("Email"));
		  // 7. Get reference of Password input box by locate the id method.
	        WebElement password = browserDriver.findElement(By.name("Password"));
		    // 8. Get reference of login button by locate the classname method.
	        WebElement submitBtn = browserDriver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
		    // 9. Clear the Email input box.
	        username.clear();
		    // 10. Provide/Enter the correct email to email input box through reference.
	        username.sendKeys(userName);
		    // 11. Clear the Password input box.
	        password.clear();
		    // 12. Provide/Enter the correct password to password input box through reference.
	        password.sendKeys(passWord);
		   // 13. Click Submit the button.
	        submitBtn.click();
	        System.out.println("End Result: Form submitted");
	        Thread.sleep(2000);
	    }

// 3. Add @DataProvider to the method 
  @DataProvider
// 1. Create a dataProvider method. In dataProvider method the return time of the method is array and values are returned in form of array.
  public Object[][] dp() {
	  // 2.Return values of email,password and message mutiple times using array.So everytime you are calling the dp method it will return all value one
	  // by one .That means this code will rum 3 times 
    return new Object[][] {
    	new Object[] { "admin", "admin132" ,"Wrong Credentials"}, 
        new Object[] { "admin", "admnhhj","Wrong Credentials" },
        new Object[] { "admin@yourstore.com", "admin","Test Passed" },
    };
  }
}

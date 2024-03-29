// In this selenium code we are opening amazon website link using chromeDriver
// Steps to perform 
// 1. setup the property of chromedriver to open amazon page through chrome web browser.
// 2. Initialize Webdriver object through ChromeDriver class.
// 3. Open the http://www.amazon.com/ link using get method.

package seleniumPackage;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenCloseAmazon {
public static void main(String[] args) {
	// 1. setup the property of chromedriver to open amazon page through chrome web browser.
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
	// 2. Initialize Webdriver object through ChromeDriver class. 
        WebDriver browserObject = new ChromeDriver();
	// 3. Open the http://www.amazon.com/ link using get method.
        browserObject.get("http://www.amazon.com/");
	browserObject.close();
	}

}

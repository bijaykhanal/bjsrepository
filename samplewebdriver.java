import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class samplewebdriver {

	public static void main(String[] args) {

	
    System.setProperty("webdriver.gecko.driver", "F:\\bj\\geckodriver.exe");
    DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	capabilities.setCapability("marionette", true);
    
    try
    {
       	WebDriver driver = new FirefoxDriver();
    	driver.get("http://google.com");
    	Thread.sleep(1800);
    }
    
    
    catch(Exception e)
    {
        System.out.println(e);
    }
    	
        
	}

}

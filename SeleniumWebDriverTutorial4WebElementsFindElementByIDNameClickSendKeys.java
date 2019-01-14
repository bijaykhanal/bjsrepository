//yo sab youtubeko automationzone vanne channelko tutorials ho


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverTutorial4WebElementsFindElementByIDNameClickSendKeys {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","F:\\bj\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
				
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		
		driver.findElement(By.id("email")).sendKeys("mercury");
		
		
		 driver.findElement(By.name("password")).sendKeys("mercury");
		
		
		 driver.findElement(By.name("confirmPassword")).sendKeys("mercury");
		
		

		driver.findElement(By.name("register")).click();
		

		Thread.sleep(5000);
		
		driver.close();
		
		driver.quit();
				
	}

}

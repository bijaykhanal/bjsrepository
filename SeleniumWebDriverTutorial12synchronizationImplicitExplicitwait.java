
//yesma implicitly ra explicitly duwai cha. chanera garne jun vae ni euta.


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverTutorial12synchronizationImplicitExplicitwait {

	public static void main(String[] args) {

		boolean flag = false;
		
		String xpath = "//span[text()='Buzz  Buzz']";
		
     System.setProperty("webdriver.chrome.driver","F:\\bj\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//driver.manage().implicitlyWait(40, TimeUnit Seconds); //implicitly waitko ho yo 

		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
	
		
		try {
			
			//explicitlywaitko lagi yo line thapne yeha: WebDriverWait wait = new WebDriverWait(driver, 50); wait.until()ExpectedConditions.visibilityofElementLocation(By.xpath(xpath)));
			
			
			flag = driver.findElement(By.xpath(xpath)).isDisplayed();
		}
		catch(Exception e) { //yadi element vettaena vane try bata catch ma jancha ani flag ma vako false print garcha
		
		flag = false;
		}
		System.out.println(flag);
		
		driver.close();
						
	}

}

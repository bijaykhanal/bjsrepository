
//yo vejja cha puraa chaina yo

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverTutorial14AlertsAlertpopups {

	public static void main(String[] args) throws Exception {
         String xpath = "//button[text()='Try it']";
		 System.setProperty("webdriver.chrome.driver","F:\\bj\\chromedriver_win32\\chromedriver.exe" );
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
			driver.switchTo().frame("iframeResult");
			driver.findElement(By.xpath(xpath)).click();
			driver.switchTo().alert().accept(); //tryit click garepachi popupma accept garchha dismiss() gare cancel garcha popupma
			driver.switchTo().parentFrame();
			
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
			driver.switchTo().frame("iframeResult");
			driver.findElement(By.xpath(xpath)).click();
			driver.switchTo().alert().sendKeys("Automata");
			driver.switchTo().alert().accept();
			driver.switchTo().parentFrame();
			Thread.sleep(5000);

			driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
			driver.switchTo().frame("iframeResult");
			driver.findElement(By.xpath(xpath)).click();
			System.out.println(driver.getTitle());

			driver.close();

		
		
		
		
		
		
		
		
	}

}

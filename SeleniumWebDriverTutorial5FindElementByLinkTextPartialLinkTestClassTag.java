import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverTutorial5FindElementByLinkTextPartialLinkTestClassTag {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","F:\\bj\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.linkText("REGISTER")).click();//by full link text
		
		driver.findElement(By.partialLinkText("SUPP")).click();//by unique partial link text
		
		//driver.findElement(By.tagName(tagName)).click();
		
		//driver.findElement(By.xpath(xpathExpression)).click();

		//driver.findElement(By.cssSelector(cssSelector)).click();

		
		
		
		
		
		
		
		
		
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverTutorial11Project1WebScraperorCrawlerPart1 {

	public static void main(String[] args) throws InterruptedException {

		//yasma google ma gaera search garne ani 5wata pages visit garne
		
		
		String strXpath;
		
System.setProperty("webdriver.chrome.driver","F:\\bj\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com/");
	
//webscraping vaneko data mining ho ie.go ahead and  collecting data from some application
		
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		Thread.sleep(2000);
			
		
		for (int i = 1; i<5;i++) {
			
			if(i>1) {
				strXpath = "//a[@class='fl' and text()='"+i+"']" ;
				
				driver.findElement(By.xpath(strXpath)).click();
				 
				Thread.sleep(2000);
		
			}
		
		
		}
	}
}

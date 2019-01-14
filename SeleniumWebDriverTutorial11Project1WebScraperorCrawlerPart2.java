import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverTutorial11Project1WebScraperorCrawlerPart2 {

	public static void main(String[] args) throws Exception {

		//yasma googlema search garne ani 5 wata page visit garne ani data retieve garne
		
		
		List <WebElement> searchPageResults;
		List <String> allLinkText = new ArrayList<>();
		
		
		
		
System.setProperty("webdriver.chrome.driver","F:\\bj\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com/");
	
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		Thread.sleep(2000);
			
for (int i = 1; i<5;i++) {
			
			if(i>1) {
				String strXpath = "//a[@class='fl' and text()='"+i+"']" ;
				
				driver.findElement(By.xpath(strXpath)).click();
				 
				Thread.sleep(2000);
		
			}
		
			
			searchPageResults = driver.findElements(By.xpath("//div[@class = 'rc']/h3/a"));
			
			
			for (WebElement link : searchPageResults) {
			
				allLinkText.add(link.getText());
				
			}
		for (String eachLinkText:allLinkText) {
			
			System.out.println(eachLinkText);
		}
			
        }	
		
	}

}

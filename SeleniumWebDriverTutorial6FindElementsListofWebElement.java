import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverTutorial6FindElementsListofWebElement {

	public static void main(String[] args) {

		

		class SeleniumWebDriverTutorial5FindElementByLinkTextPartialLinkTestClassTag {

			public void main(String[] args) {

				System.setProperty("webdriver.chrome.driver","F:\\bj\\chromedriver_win32\\chromedriver.exe" );
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://newtours.demoaut.com/");
				
				List<WebElement> objLinks = driver.findElements(By.tagName("a"));//it passes all the links(which are all webelements) with tag "a" to an object "objlinks" (which will result in a  list of webelements) 
				
				
				
				//Now iterating through this list objLinks
				//since this is a list of for each element we use the below
				
				for(WebElement obkCurrentLink:objLinks) {
					
					String strLinkText = obkCurrentLink.getText();// get text is used to return the inner texts contained in the webelemeent are stored in the variable strLinkText 
					                                              
					System.out.println(strLinkText);//these texts are all printed out
				
				
				
				}
				
			}

		}

		
	}

}
